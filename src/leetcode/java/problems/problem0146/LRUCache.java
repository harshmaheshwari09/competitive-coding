package leetcode.java.problems.problem0146;

import java.util.HashMap;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/lru-cache/
 * Tags: #design
 * Complexity: Space: O(capacity * size_of_node)
 */
public class LRUCache {
    Map<Integer, Node> keyMapping;
    DoublyLinkedList doublyLinkedList;

    public class Node {
        int key;
        int value;
        Node left;
        Node right;

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node() {
        }

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public class DoublyLinkedList {
        Node head;
        Node tail;
        int length;

        public DoublyLinkedList(int capacity) {
            this.length = capacity;
            head = new Node();
            tail = new Node();
            head.right = tail;
            tail.left = head;
        }

        public void add(Node node) {
            node.right = head.right;
            node.left = head;
            head.right.left = node;
            head.right = node;
            this.length--;
        }

        public void remove(Node node) {
            this.length++;
            node.left.right = node.right;
            node.right.left = node.left;
            node.left = node.right = null;
        }

        public int removeLFU() {
            Node node = tail.left;
            remove(node);
            return node.key;
        }
    }

    public LRUCache(int capacity) {
        keyMapping = new HashMap<>();
        doublyLinkedList = new DoublyLinkedList(capacity);
    }

    // Complexity: Time: O(1)
    public int get(int key) {
        if (keyMapping.containsKey(key)) {
            Node node = keyMapping.get(key);
            doublyLinkedList.remove(node);
            doublyLinkedList.add(node);
            return node.getValue();
        }
        return -1;
    }

    // Complexity: Time: O(1)
    public void put(int key, int value) {
        if (keyMapping.containsKey(key)) {
            Node node = keyMapping.get(key);
            node.setValue(value);
            doublyLinkedList.remove(node);
            doublyLinkedList.add(node);
            return;
        }

        Node node = new Node(key, value);
        if (doublyLinkedList.length == 0) {
            int removedKey = doublyLinkedList.removeLFU();
            keyMapping.remove(removedKey);
        }
        keyMapping.put(key, node);
        doublyLinkedList.add(node);
    }
}
