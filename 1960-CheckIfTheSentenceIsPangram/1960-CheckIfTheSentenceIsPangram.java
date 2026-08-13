// Last updated: 13/08/2026, 15:47:15
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int count = 0;
        
        for (char c : sentence.toCharArray()) {
            int idx = c - 'a';
            if (!seen[idx]) {
                seen[idx] = true;
                count++;
            }
            if (count == 26) return true;
        }
        
        return count == 26;
    }
}
