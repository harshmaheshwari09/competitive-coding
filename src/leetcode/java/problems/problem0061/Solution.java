package leetcode.java.problems.problem0061;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/rotate-list/description/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = ListNode.getLength(head);
        k = k % length;
        if (k == 0) {
            return head;
        }

        ListNode newHead = reverse(head, length - k);
        head.next = reverse(head.next, k);
        return reverse(newHead, length);
    }

    private ListNode reverse(ListNode head, int length) {
        ListNode prev = null;
        ListNode curr = head;
        while (length-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = curr;
        return prev;
    }
}
