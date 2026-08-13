// Last updated: 13/08/2026, 15:53:56
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            sb.append((char) ('A' + remainder));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.convertToTitle(1)); 
        System.out.println(sol.convertToTitle(28));  
        System.out.println(sol.convertToTitle(701)); 
    }
}
