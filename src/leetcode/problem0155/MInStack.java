package leetcode.problem0155;

import java.util.Stack;

class MinStack {

    Stack<int[]> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.empty() || st.peek()[1] > val) {
            st.push(new int[]{val, val});
        } else {
            st.push(new int[]{val, st.peek()[1]});
        }
    }

    public void pop() {
        if (!st.empty()) {
            st.pop();
        }
    }

    public int top() {
        if (st.empty()) {
            return -1;
        }
        return st.peek()[0];
    }

    public int getMin() {
        if (st.empty()) {
            return -1;
        }
        return st.peek()[1];
    }
}