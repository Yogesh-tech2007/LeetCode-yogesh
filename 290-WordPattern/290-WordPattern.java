// Last updated: 13/08/2026, 15:52:12
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (map.containsKey(c) && !map.get(c).equals(w)) return false;
            if (reverseMap.containsKey(w) && reverseMap.get(w) != c) return false;

            map.put(c, w);
            reverseMap.put(w, c);
        }
        return true;
    }
}
