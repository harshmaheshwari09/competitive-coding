package leetcode.java.problems.problem0496;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Ques: https://leetcode.com/problems/next-greater-element-i/
 * Tags: #stack
 * Complexity: Time: O(n), Space: O(n)
 */
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < nums2.length) {
            if (st.empty() || nums2[st.peek()] > nums2[i]) {
                st.push(i++);
                continue;
            }
            nextGreater.put(nums2[st.pop()], nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for (i = 0; i < nums1.length; i++) {
            ans[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        return ans;
    }
}