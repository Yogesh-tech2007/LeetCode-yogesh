// Last updated: 13/08/2026, 15:46:25
class Solution {
    public int countKeyChanges(String s) {
        int changes = 0;
        for (int i = 1; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(i - 1))) {
                changes++;
            }
        }
        return changes;
    }
}
