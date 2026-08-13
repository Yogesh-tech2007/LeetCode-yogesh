// Last updated: 13/08/2026, 15:47:09
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        
        for (String word : words) {
            int pos = word.charAt(word.length() - 1) - '0'; // get position
            result[pos - 1] = word.substring(0, word.length() - 1); // remove number
        }
        
        return String.join(" ", result);
    }
}
