// Last updated: 13/08/2026, 15:49:41
import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            arr[a[0]] * arr[b[1]] - arr[b[0]] * arr[a[1]]
        );

        
        for (int i = 0; i < n - 1; i++) {
            pq.offer(new int[]{i, n - 1});
        }

        for (int count = 0; count < k - 1; count++) {
            int[] frac = pq.poll();
            int i = frac[0], j = frac[1];
            if (j - 1 > i) {
                pq.offer(new int[]{i, j - 1});
            }
        }

        int[] result = pq.peek();
        return new int[]{arr[result[0]], arr[result[1]]};
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int[] ans = sol.kthSmallestPrimeFraction(arr, k);
        System.out.println(ans[0] + "/" + ans[1]); 
    }
}
