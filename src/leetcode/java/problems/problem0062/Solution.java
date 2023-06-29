package leetcode.java.problems.problem0062;

/**
 * Ques: https://leetcode.com/problems/unique-paths/
 * Tags: #dp
 * Complexity: Time: O(m * n), Space: O(m * n)
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] dp = new Integer[m][n];
        return helper(m - 1, n - 1, dp);
    }

    private int helper(int i, int j, Integer[][] dp) {
        if (i == 0 && j == 0) {
            return 1;
        }

        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        return dp[i][j] = helper(i - 1, j, dp) + helper(i, j - 1, dp);
    }
}
