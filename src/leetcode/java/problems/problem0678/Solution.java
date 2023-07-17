package leetcode.java.problems.problem0678;

/**
 * Ques: https://leetcode.com/problems/valid-parenthesis-string/
 * Tags: #greedy
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;
        for (char ch : s.toCharArray()) {
            leftMin += (ch == '(' ? 1 : -1);
            leftMax += (ch == ')' ? -1 : 1);
            if (leftMax < 0) {
                return false;
            }
            leftMin = Math.max(leftMin, 0);
        }
        return leftMin == 0;
    }
}
