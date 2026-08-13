// Last updated: 13/08/2026, 15:55:52
class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int temp=x;
        int ldigit;
        while(x>0){
            ldigit=x%10;
            rev=rev*10+ldigit;
            x/=10;
        }
        if(temp==rev){
            return true;}
        else{
            return false;}
    }
}