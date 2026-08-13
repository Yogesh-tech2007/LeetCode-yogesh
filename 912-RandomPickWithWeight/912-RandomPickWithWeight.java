// Last updated: 13/08/2026, 15:49:15
import java.util.*;

class Solution {
    int[] prefixSums;
    int total;
    Random rand;

    public Solution(int[] w) {
        prefixSums = new int[w.length];
        rand = new Random();
        int sum = 0;
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            prefixSums[i] = sum;
        }
        total = sum;
    }

    public int pickIndex() {
        int target = rand.nextInt(total) + 1; 
        int left = 0, right = prefixSums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefixSums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] w = {1, 3};
        Solution sol = new Solution(w);
        
        for (int i = 0; i < 10; i++) {
            System.out.println(sol.pickIndex());
        }
    }
}
