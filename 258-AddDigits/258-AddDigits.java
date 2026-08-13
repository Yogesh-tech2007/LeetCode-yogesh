// Last updated: 13/08/2026, 15:52:23
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.addDigits(38)); 
        System.out.println(sol.addDigits(0)); 
    }
}
