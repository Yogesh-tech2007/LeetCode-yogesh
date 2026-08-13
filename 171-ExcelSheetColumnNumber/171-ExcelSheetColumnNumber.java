// Last updated: 13/08/2026, 15:53:51
class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.titleToNumber("A"));  
        System.out.println(sol.titleToNumber("AB")); 
        System.out.println(sol.titleToNumber("ZY"));  
    }
}
