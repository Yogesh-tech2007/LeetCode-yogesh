// Last updated: 13/08/2026, 15:46:10
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int a = s.length();
        int b = t.length();
        if(a>b)
            return false;
        int[] sf = new int[a+1];
        sf[a] = b;
        int c = b-1;
        for(int i = a-1;i>=0;i--){
            while(c>=0 && t.charAt(c) != s.charAt(i)) 
                c--;
            sf[i] = c--;
        }
        if(sf[0]>=0)
            return true;
        c=0;
        for(int i =0;i<a;i++){
            if(sf[i+1]-c>=1)
                return true;
            while(c<b && t.charAt(c) != s.charAt(i))
                c++;
            if(c>=b)
                break;
            c++;
        }
        return false;
    }
}