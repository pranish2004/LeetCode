import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int[] arr : grid) {
            String key = Arrays.toString(arr);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int[][] grid1 = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid1[j][i] = grid[i][j];
            }
        }

        int count = 0;
        for (int[] brr : grid1) {
            String key = Arrays.toString(brr);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
        }
        
        return count;
    }
}
