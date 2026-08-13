// Last updated: 13/08/2026, 15:50:10
import java.util.*;

class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words); //  
        Set<String> built = new HashSet<>();
        String result = "";

        for (String word : words) {
            if (word.length() == 1 || built.contains(word.substring(0, word.length() - 1))) {
                built.add(word);
                if (word.length() > result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words1 = {"w","wo","wor","worl","world"};
        String[] words2 = {"a","banana","app","appl","ap","apply","apple"};
        System.out.println(sol.longestWord(words1)); 
        System.out.println(sol.longestWord(words2)); 
    }
}
