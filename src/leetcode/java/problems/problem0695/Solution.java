package leetcode.java.problems.problem0695;

/**
 * Ques: https://leetcode.com/problems/max-area-of-island
 * Tags: #dfs
 * Complexity: Time: O(n^2), Space: O(1)
 */
public class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, getMaxArea(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private final static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private int getMaxArea(int[][] grid, int i, int j) {
        if(!isSafe(grid, i, j)) {
            return 0;
        }
        grid[i][j] = 0;
        int ans = 1;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            ans += getMaxArea(grid, x, y);
        }
        return ans;
    }

    private boolean isSafe(int[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == 0) {
            return false;
        }
        return true;
    }
}
