package leetcode.java.problems.problem0739;

import java.util.Stack;

/**
 * Ques: https://leetcode.com/problems/daily-temperatures/
 * Tags: #stack
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] nextWarmer = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < temperatures.length) {
            if (st.empty() || temperatures[st.peek()] >= temperatures[i]) {
                st.push(i++);
            } else {
                int day = st.pop();
                nextWarmer[day] = i - day;
            }
        }
        while (st.size() > 0) {
            nextWarmer[st.pop()] = 0;
        }
        return nextWarmer;
    }
}
