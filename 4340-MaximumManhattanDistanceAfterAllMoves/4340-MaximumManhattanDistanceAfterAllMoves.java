// Last updated: 13/08/2026, 15:46:06
import java.util.*;
class Solution {
    public static int maxDistance(String moves){
        int x = 0, y=0, free=0;
        for(char c: moves.toCharArray()){
            if(c == 'U')
                y++;
            else if(c=='D')y--;
            else if(c == 'L')x--;
            else if (c == 'R')x++;
            else  free++;
        }
        return Math.abs(x) + Math.abs(y) + free;
    }
    
        }
    
    
