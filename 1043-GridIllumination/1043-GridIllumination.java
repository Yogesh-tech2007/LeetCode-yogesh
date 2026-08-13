// Last updated: 13/08/2026, 15:48:49
import java.util.*;

class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        Map<Integer, Integer> row = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        Map<Integer, Integer> diag1 = new HashMap<>(); // r - c
        Map<Integer, Integer> diag2 = new HashMap<>(); // r + c
        Set<String> lampSet = new HashSet<>();

        for (int[] lamp : lamps) {
            int r = lamp[0], c = lamp[1];
            String key = r + "," + c;
            if (lampSet.contains(key)) continue;
            lampSet.add(key);

            row.put(r, row.getOrDefault(r, 0) + 1);
            col.put(c, col.getOrDefault(c, 0) + 1);
            diag1.put(r - c, diag1.getOrDefault(r - c, 0) + 1);
            diag2.put(r + c, diag2.getOrDefault(r + c, 0) + 1);
        }

        int[] ans = new int[queries.length];
        int idx = 0;

        for (int[] q : queries) {
            int r = q[0], c = q[1];

            if (row.getOrDefault(r, 0) > 0 ||
                col.getOrDefault(c, 0) > 0 ||
                diag1.getOrDefault(r - c, 0) > 0 ||
                diag2.getOrDefault(r + c, 0) > 0) {
                ans[idx] = 1;
            } else {
                ans[idx] = 0;
            }

            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    int nr = r + dr, nc = c + dc;
                    String key = nr + "," + nc;
                    if (lampSet.contains(key)) {
                        lampSet.remove(key);
                        row.put(nr, row.get(nr) - 1);
                        col.put(nc, col.get(nc) - 1);
                        diag1.put(nr - nc, diag1.get(nr - nc) - 1);
                        diag2.put(nr + nc, diag2.get(nr + nc) - 1);
                    }
                }
            }
            idx++;
        }

        return ans;
    }
}
