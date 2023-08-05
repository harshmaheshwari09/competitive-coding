package leetcode.java.problems.problem0139;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Ques: https://leetcode.com/problems/word-break/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>();
        for (String word : wordDict) {
            dict.add(word);
        }
        Boolean[] dp = new Boolean[s.length()];
        return helper(s, 0, dict, dp);
    }

    private boolean helper(String s, int i, Set<String> dict, Boolean[] dp) {
        if (i == s.length()) {
            return true;
        }

        if (dp[i] != null) {
            return dp[i];
        }

        for (String word : dict) {
            if (i + word.length() > s.length()) {
                continue;
            }

            if (s.substring(i, i + word.length()).equals(word) && helper(s, i + word.length(), dict, dp)) {
                return dp[i] = true;
            }
        }
        return dp[i] = false;
    }
}
