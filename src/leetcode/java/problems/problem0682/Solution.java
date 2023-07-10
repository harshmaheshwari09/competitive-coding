package leetcode.java.problems.problem0682;

import java.util.Stack;

/**
 * Ques: https://leetcode.com/problems/baseball-game/
 * Tags: #stack
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "+" -> {
                    int lastRecord = st.pop();
                    int newRecord = lastRecord + st.peek();
                    st.push(lastRecord);
                    st.push(newRecord);
                }
                case "D" -> st.push(st.peek() * 2);
                case "C" -> st.pop();
                default -> st.push(Integer.parseInt(operation));
            }
        }
        int ans = 0;
        while (st.size() > 0) {
            ans += st.pop();
        }
        return ans;
    }
}
