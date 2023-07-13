package leetcode.java.problems.problem0141;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/linked-list-cycle/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fastPtr = head, slowPtr = head;
        do {
            if (fastPtr == null || fastPtr.next == null) {
                return false;
            }
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        } while (slowPtr != fastPtr);
        return true;
    }
}
