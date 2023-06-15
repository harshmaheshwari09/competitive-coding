package leetcode.problem2352;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rowMap = new HashMap<>();
        compute(grid, rowMap, true);
        System.out.println(rowMap);
        Map<String, Integer> colMap = new HashMap<>();
        compute(grid, colMap, false);
        System.out.println(colMap);
        int ans = 0;
        for (var entry : rowMap.entrySet()) {
            if (colMap.containsKey(entry.getKey())) {
                ans += (colMap.get(entry.getKey()) *  entry.getValue());
            }
        }
        return ans;
    }

    public void compute(int[][] grid, Map<String, Integer> map, boolean rowWise) {
        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                sb.append((rowWise ? grid[i][j] : grid[j][i])).append(".");
            }
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }
    }
}
