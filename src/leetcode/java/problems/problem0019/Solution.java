package leetcode.java.problems.problem0019;

import leetcode.java.model.ListNode;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// #linked_list
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left, right, dummy;
        dummy = new ListNode();
        dummy.next = head;
        left = right = dummy;
        for (int i = 0; i < n; i++) {
            right = right.next;
        }
        while (right.next != null) {
            left = left.next;
            right = right.next;
        }
        ListNode temp = left.next;
        left.next = temp.next;
        temp.next = null;
        return dummy.next;
    }
}
