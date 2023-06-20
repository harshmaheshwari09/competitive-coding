package leetcode.java.problems.problem0072;

public class Solution {
    public int minDistance(String word1, String word2) {
        Integer[][] dp = new Integer[word1.length()][word2.length()];
        return helper(word1, 0, word2, 0, dp);
    }

    public int helper(String word1, int ptr1, String word2, int ptr2, Integer[][] dp) {
        if (ptr1 == word1.length() || ptr2 == word2.length()) {
            return word1.length() - ptr1 + word2.length() - ptr2;
        }

        if (dp[ptr1][ptr2] != null) {
            return dp[ptr1][ptr2];
        }

        // case_1: both the char are same
        if (word1.charAt(ptr1) == word2.charAt(ptr2)) {
            return dp[ptr1][ptr2] = helper(word1, ptr1 + 1, word2, ptr2 + 1, dp);
        }

        // case_2: replace
        int case2 = helper(word1, ptr1 + 1, word2, ptr2 + 1, dp);

        // case_3: delete from first / addition on second
        int case3 = helper(word1, ptr1 + 1, word2, ptr2, dp);

        // case_4: delete from second / addition on first
        int case4 = helper(word1, ptr1, word2, ptr2 + 1, dp);

        return dp[ptr1][ptr2] = 1 + Math.min(case2, Math.min(case3, case4));
    }
}
