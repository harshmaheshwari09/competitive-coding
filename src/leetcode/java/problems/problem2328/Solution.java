package leetcode.java.problems.problem2328;

/**
 * ques: https://leetcode.com/problems/number-of-increasing-paths-in-a-grid/
 * tags: #dp
 * complexity: Time: O(n^2), Space: O(n^2)
 */
public class Solution {
    private final static int MOD = (int) Math.pow(10, 9) + 7;

    public int countPaths(int[][] grid) {
        Integer[][] dp = new Integer[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                helper(grid, i, j, dp);
            }
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result = (result + dp[i][j] % MOD) % MOD;
            }
        }
        return result;
    }

    private final static int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private int helper(int[][] grid, int i, int j, Integer[][] dp) {
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int ans = 1;
        for (int[] dir : DIRECTIONS) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (0 <= x && x < grid.length && 0 <= y && y < grid[0].length && grid[i][j] < grid[x][y]) {
                ans = (ans + helper(grid, x, y, dp) % MOD) % MOD;
            }
        }
        return dp[i][j] = ans;
    }
}
