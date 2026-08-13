// Last updated: 13/08/2026, 15:46:12
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char h = s.charAt(i);
            if(h==y){
                a.append(h);
            
            }
            else if(h == x){
                c.append(h);
            }
            else{
                b.append(h);
            }
        }
        return a.append(b).append(c).toString();
    }
}