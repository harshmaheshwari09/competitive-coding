package leetcode.java.problems.problem0138;

/**
 * Ques: https://leetcode.com/problems/copy-list-with-random-pointer/
 * Tags: #linked_list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // add new nodes
        Node node = head;
        while (node != null) {
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }

        // update random ptr
        node = head;
        while (node != null) {
            node.next.random = (node.random == null ? null : node.random.next);
            node = node.next.next;
        }

        // separate
        Node newHead;
        newHead = head.next;
        node = head;
        while (node != null) {
            Node copyNode = node.next;
            node.next = copyNode.next;
            node = node.next;
            copyNode.next = (node == null ? null : node.next);
        }
        return newHead;
    }

    public class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
