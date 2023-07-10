package leetcode.java.problems.problem0070;

/**
 * Ques: https://leetcode.com/problems/climbing-stairs/
 * Tags: #dp
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return recursive(n, dp);
    }

    private int iterative(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    private int recursive(int n, Integer[] dp) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (dp[n] != null) {
            return dp[n];
        }
        return dp[n] = recursive(n-1, dp) + recursive(n-2, dp);
    }
}
