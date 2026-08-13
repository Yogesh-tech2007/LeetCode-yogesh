// Last updated: 13/08/2026, 15:48:16
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(count.values());

        return count.size() == set.size();
    }
}
