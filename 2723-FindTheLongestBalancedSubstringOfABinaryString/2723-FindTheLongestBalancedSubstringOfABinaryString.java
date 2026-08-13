// Last updated: 13/08/2026, 15:46:47
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        
        while (i < s.length()) {
            int zeros = 0, ones = 0;
            
            while (i < s.length() && s.charAt(i) == '0') {
                zeros++;
                i++;
            }
            
            while (i < s.length() && s.charAt(i) == '1') {
                ones++;
                i++;
            }
            
            maxLen = Math.max(maxLen, 2 * Math.min(zeros, ones));
        }
        
        return maxLen;
    }
}
