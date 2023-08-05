package leetcode.java.problems.problem0005;

/**
 * Ques: https://leetcode.com/problems/longest-palindromic-substring/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public String longestPalindrome(String s) {
        int[] ans = {0, 0};
        for (int i = 0; i < s.length(); i++) {
            int oddLength = expand(s, i, i);
            if (oddLength > ans[1] - ans[0] + 1) {
                int dis = oddLength / 2;
                ans[0] = i - dis;
                ans[1] = i + dis;
            }

            int evenLength = expand(s, i, i + 1);
            if (evenLength > ans[1] - ans[0] + 1) {
                int dis = (evenLength / 2) - 1;
                ans[0] = i - dis;
                ans[1] = i + 1 + dis;
            }
        }
        return s.substring(ans[0], ans[1] + 1);
    }

    private int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
