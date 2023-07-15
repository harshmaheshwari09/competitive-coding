package leetcode.java.problems.problem0025;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/reverse-nodes-in-k-group/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1 || isShorter(head, k)) {
            return head;
        }

        ListNode prev = null, curr = head;
        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseKGroup(curr, k);
        return prev;
    }

    private boolean isShorter(ListNode head, int k) {
        ListNode node = head;
        while (node != null) {
            node = node.next;
            k--;
            if (k == 0) {
                return false;
            }
        }
        return true;
    }
}
