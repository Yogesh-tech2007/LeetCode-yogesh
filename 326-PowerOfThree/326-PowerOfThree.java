// Last updated: 13/08/2026, 15:52:07
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPowerOfThree(27)); 
        System.out.println(sol.isPowerOfThree(0));  
        System.out.println(sol.isPowerOfThree(9));  
        System.out.println(sol.isPowerOfThree(45)); 
    }
}
