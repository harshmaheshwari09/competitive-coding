package leetcode.java.problems.problem0876;

import leetcode.java.model.ListNode;

// https://leetcode.com/problems/middle-of-the-linked-list/
// #linked_list
public class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
