package leetcode.problem0002;

import resources.ListNode;

/** ques: https://leetcode.com/problems/add-two-numbers/description/
 *  tags: #linked_list
 *  complexity: O(n + m)
 *  */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        int sum = 0;
        while (l1 != null || l2 != null || sum > 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode node = new ListNode(sum % 10);
            sum = sum / 10;
            curr.next = node;
            curr = curr.next;
        }
        return head.next;
    }
}
