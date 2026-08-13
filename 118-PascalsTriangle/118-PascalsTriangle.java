// Last updated: 13/08/2026, 15:54:23
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int row = 0; row < numRows; row++) {
            List<Integer> newRow = new ArrayList<>();
            
            newRow.add(1);
            
            for (int j = 1; j < row; j++) {
                int val = triangle.get(row - 1).get(j - 1) + triangle.get(row - 1).get(j);
                newRow.add(val);
            }
            
            if (row > 0) {
                newRow.add(1);
            }
            
            triangle.add(newRow);
        }
        
        return triangle;
    }
}
