package leetcode.java.problems.problem0647;

/**
 * Ques: https://leetcode.com/problems/palindromic-substrings/
 * Tags: #dp
 * Complexity: Time: O(n^2), Space: O(1)
 */
public class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += expand(s, i, i) + expand(s, i, i + 1);
        }
        return ans;
    }

    private int expand(String s, int left, int right) {
        int ans = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            ans++;
            left--;
            right++;
        }
        return ans;
    }
}
