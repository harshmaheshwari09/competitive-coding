package leetcode.java.problems.problem0084;

import java.util.Stack;

/**
 * Ques: https://leetcode.com/problems/largest-rectangle-in-histogram/
 * Tags: #stack
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        int idx = 0;
        while (idx < heights.length) {
            if (st.empty() || heights[idx] >= heights[st.peek()]) {
                st.push(idx++);
            } else {
                int top = st.pop();
                ans = Math.max(ans, (idx - getPrev(st) - 1) * heights[top]);
            }
        }
        while (st.size() > 0) {
            int top = st.pop();
            ans = Math.max(ans, (heights.length - getPrev(st) - 1) * heights[top]);
        }
        return ans;
    }

    private int getPrev(Stack<Integer> st) {
        if (st.empty()) {
            return -1;
        }
        return st.peek();
    }
}
