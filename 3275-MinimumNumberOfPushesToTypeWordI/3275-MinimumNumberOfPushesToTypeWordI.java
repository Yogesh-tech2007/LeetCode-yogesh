// Last updated: 13/08/2026, 15:46:26
import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        
        Arrays.sort(freq);
        
        int pushes = 0;
        int index = 0;
        
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) continue;
            int slot = index / 8 + 1; // slot cost
            pushes += freq[i] * slot;
            index++;
        }
        
        return pushes;
    }
}
