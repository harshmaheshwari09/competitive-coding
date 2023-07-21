package leetcode.java.problems.problem0022;

import java.util.ArrayList;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/generate-parentheses/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n, n, result, sb);
        return result;
    }

    private void helper(int left, int right, List<String> result, StringBuilder sb) {
        if (left < 0 || right < left) {
            return;
        }

        if (left == 0 && right == 0) {
            result.add(sb.toString());
            return;
        }

        // reduce left
        sb.append("(");
        helper(left - 1, right, result, sb);
        sb.deleteCharAt(sb.length() - 1);

        // reduce right
        sb.append(")");
        helper(left, right - 1, result, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
