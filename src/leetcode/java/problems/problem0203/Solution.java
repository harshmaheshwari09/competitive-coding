package leetcode.java.problems.problem0203;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/remove-linked-list-elements/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return removeElements(head.next, val);
        }
        head.next = removeElements(head.next, val);
        return head;
    }
}
