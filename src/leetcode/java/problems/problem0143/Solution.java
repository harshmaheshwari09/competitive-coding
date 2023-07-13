package leetcode.java.problems.problem0143;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/reorder-list/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public void reorderList(ListNode head) {
        ListNode fastPtr = head.next, slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = slowPtr.next;
        slowPtr.next = null;
        ptr2 = reverse(ptr2);
        while (ptr2 != null) {
            ListNode nextPtr1 = ptr1.next;
            ListNode nextPtr2 = ptr2.next;
            ptr1.next = ptr2;
            ptr2.next = nextPtr1;
            ptr1 = nextPtr1;
            ptr2 = nextPtr2;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
