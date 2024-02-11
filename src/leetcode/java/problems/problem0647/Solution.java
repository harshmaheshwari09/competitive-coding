package leetcode.java.problems.problem0647;

/**
 * Ques: https://leetcode.com/problems/palindromic-substrings/description/
 */
public class Solution {
    public int countSubstrings(String s) {
        return dynamicProgrammingSolution(s);
        //return iterativeSolution(s);
    }

    /**
     * /----- Iterative Solution -----/
     * Space: O(1)
     * Time : O(n^2)
     */
    public int iterativeSolution(String s) {
        int ans = 0;
        for (int current = 0; current < s.length(); current++) {
            // odd length palindrome
            ans += countPalindrome(current, current, s);

            // even length palindrome
            ans += countPalindrome(current, current + 1, s);
        }
        return ans;
    }

    public int countPalindrome(int left, int right, String s) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    /**
     * /------ DP Solution -------/
     * Space: O(n^2)
     * Time : O(n^2)
     */
    public int dynamicProgrammingSolution(String s) {
        int length = s.length();
        Boolean[][] dp = new Boolean[length][length];
        helper(s, 0, length - 1, dp);

        int ans = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (dp[i][j]) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public boolean helper(String s, int i, int j, Boolean[][] dp) {
        if (i >= j) {
            return dp[i][j] = true;
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        dp[i][j] = false;
        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = helper(s, i + 1, j - 1, dp);
        }

        helper(s, i, j - 1, dp);
        helper(s, i + 1, j, dp);
        return dp[i][j];
    }
}
