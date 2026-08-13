// Last updated: 13/08/2026, 15:46:43
import java.util.*;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> seen = new HashSet<>();
        int count = 0;
        
        for (String w : words) {
            String rev = new StringBuilder(w).reverse().toString();
            if (seen.contains(rev)) {
                count++;
            } else {
                seen.add(w);
            }
        }
        
        return count;
    }
}
