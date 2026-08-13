// Last updated: 13/08/2026, 15:51:13
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        String doubled = s + s;
        return doubled.substring(1, 2 * n - 1).contains(s);
    }
}
