package leetcode.java.problems.problem0160;

import leetcode.java.model.ListNode;

/**
 * Ques: https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Tags: #
 * Complexity: Time: , Space:
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = ListNode.getLength(headA);
        int lenB = ListNode.getLength(headB);
        return helper(headA, lenA, headB, lenB);
    }

    private ListNode helper(ListNode headA, int lenA, ListNode headB, int lenB) {
        if (lenB > lenA) {
            return helper(headB, lenB, headA, lenA);
        }
        int diff = lenA - lenB;
        ListNode currA = headA;
        ListNode currB = headB;
        while (diff-- > 0) {
            currA = currA.next;
        }
        while (currA != currB) {
            currA = currA.next;
            currB = currB.next;
        }
        return currA;
    }
}