package leetcode.java.problems.problem0083;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = deleteDuplicates(head.next);
        if (next != null && head.val == next.val) {
            return next;
        }
        head.next = next;
        return head;
    }
}
