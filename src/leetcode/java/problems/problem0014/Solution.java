package leetcode.java.problems.problem0014;

/**
 * Ques: https://leetcode.com/problems/longest-common-prefix/
 * Tags: #string
 * Complexity: Time: O(n), Space: O(n)
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        end:
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    break end;
                }
            }
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }
}
