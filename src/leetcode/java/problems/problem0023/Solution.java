package leetcode.java.problems.problem0023;

import leetcode.java.model.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Ques: https://leetcode.com/problems/merge-k-sorted-lists/
 * Tags: #linked_list, #heap
 * Complexity: Time: O(n * log(k)), Space: O(k)
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }
        ListNode head = new ListNode();
        ListNode curr = head;
        while (pq.size() > 1) {
            ListNode node = pq.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                pq.offer(node.next);
            }
        }
        curr.next = pq.poll();
        return head.next;
    }
}
