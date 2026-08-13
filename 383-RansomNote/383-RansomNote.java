// Last updated: 13/08/2026, 15:51:48
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (freq[c - 'a'] == 0) return false;
            freq[c - 'a']--;
        }
        
        return true;
    }
}
