package leetcode.java.problems.problem0021;

import leetcode.java.model.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val <= ptr2.val) {
                curr.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                curr.next = ptr2;
                ptr2 = ptr2.next;
            }
            curr = curr.next;
        }
        if (ptr1 != null) {
            curr.next = ptr1;

        }
        if (ptr2 != null) {
            curr.next = ptr2;
        }
        return head.next;
    }
}
