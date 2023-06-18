package leetcode.java.problem0020;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
                continue;
            }

            if (c == ')' && st.size() > 0 && st.peek() == '(') {
                st.pop();
                continue;
            }


            if (c == '}' && st.size() > 0 && st.peek() == '{') {
                st.pop();
                continue;
            }


            if (c == ']' && st.size() > 0 && st.peek() == '[') {
                st.pop();
                continue;
            }

            return false;
        }
        return st.size() == 0;
    }
}