package leetcode.java.problems.problem0150;

import java.util.Stack;

/**
 * Ques: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Tags: #stack
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b + a);
                }
                case "-" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b - a);
                }
                case "*" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b * a);
                }
                case "/" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b / a);
                }
                default -> st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
