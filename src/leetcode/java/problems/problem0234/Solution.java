package leetcode.java.problems.problem0234;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/palindrome-linked-list/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = reverse(slow.next);
        return isSame(ptr1, ptr2);
    }

    private boolean isSame(ListNode ptr1, ListNode ptr2) {
        while (ptr2 != null) {
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
            curr = next;
        }
        return prev;
    }
}
