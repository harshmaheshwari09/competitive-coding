package leetcode.java.problem0237;

import leetcode.java.resources.ListNode;

/**
 * ques: https://leetcode.com/problems/delete-node-in-a-linked-list/
 * tags: #linked_list
 * complexity: O(1)
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode nodeToRemove = node.next;
        node.val = nodeToRemove.val;
        node.next = nodeToRemove.next;
        nodeToRemove.next = null;
    }
}
