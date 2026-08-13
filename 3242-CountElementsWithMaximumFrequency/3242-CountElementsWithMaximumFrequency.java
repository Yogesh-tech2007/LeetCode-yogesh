// Last updated: 13/08/2026, 15:46:32
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int f : freq.values()) {
            maxFreq = Math.max(maxFreq, f);
        }

        int count = 0;
        for (int f : freq.values()) {
            if (f == maxFreq) {
                count++;
            }
        }

        return count * maxFreq;
    }
}
