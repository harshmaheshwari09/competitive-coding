package leetcode.java.problems.problem0234;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/palindrome-linked-list/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        int mid = ListNode.getLength(head) / 2;
        ListNode ptr1 = head;
        while (mid-- > 0) {
            ptr1 = ptr1.next;
        }
        ptr1 = reverse(ptr1);
        ListNode ptr2 = head;
        return isSame(ptr1, ptr2);
    }

    private boolean isSame(ListNode ptr1, ListNode ptr2) {
        while (ptr1 != null) {
            if (ptr1.val != ptr2.val) {
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr  =next;
        }
        return prev;
    }
}
