// Last updated: 13/08/2026, 15:49:36
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
