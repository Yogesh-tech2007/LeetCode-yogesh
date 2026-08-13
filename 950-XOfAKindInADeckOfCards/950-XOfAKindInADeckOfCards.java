// Last updated: 13/08/2026, 15:49:07
import java.util.*;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int card : deck) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }
        
        int gcd = 0;
        for (int count : countMap.values()) {
            gcd = findGCD(gcd, count);
        }
        
        return gcd >= 2;
    }
    
    private int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}
