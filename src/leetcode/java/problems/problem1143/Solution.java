package leetcode.java.problems.problem1143;

/**
 * ques: https://leetcode.com/problems/longest-common-subsequence/
 * tags: #dp
 * complexity: Time: O(n^2), Space: O(n^2)
 */
public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] dp = new Integer[text1.length()][text2.length()];
        return helper(text1, 0, text2, 0, dp);
    }

    public int helper(String text1, int ptr1, String text2, int ptr2, Integer[][] dp) {
        if (ptr1 == text1.length() || ptr2 == text2.length()) {
            return 0;
        }

        if (dp[ptr1][ptr2] != null) {
            return dp[ptr1][ptr2];
        }

        if (text1.charAt(ptr1) == text2.charAt(ptr2)) {
            return dp[ptr1][ptr2] = 1 + helper(text1, ptr1 + 1, text2, ptr2 + 1, dp);
        }
        return dp[ptr1][ptr2] =
            Math.max(
                helper(text1, ptr1 + 1, text2, ptr2, dp),
                helper(text1, ptr1, text2, ptr2 + 1, dp)
            );
    }
}
