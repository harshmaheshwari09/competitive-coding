package leetcode.java.problems.problem0460;

import java.util.HashMap;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/lfu-cache/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
class LFUCache {

    int capacity;
    Map<Integer, DoublyLinkedList> freqMapping;
    Map<Integer, Node> keyMapping;
    int minFreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        minFreq = 0;
        freqMapping = new HashMap<>();
        keyMapping = new HashMap<>();
    }

    public int get(int key) {
        if (!keyMapping.containsKey(key)) {
            return -1;
        }

        Node node = keyMapping.get(key);
        updateFreq(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (keyMapping.containsKey(key)) {
            Node node = keyMapping.get(key);
            node.value = value;
            updateFreq(node);
            return;
        }

        if (capacity == 0) {
            removeLfuElement();
        }
        Node node = new Node(key, value);
        minFreq = 1;
        addNodeToFreqQueue(node);
        keyMapping.put(key, node);
    }

    private void addNodeToFreqQueue(Node node) {
        if (!freqMapping.containsKey(node.freq)) {
            freqMapping.put(node.freq, new DoublyLinkedList());
        }
        DoublyLinkedList dll = freqMapping.get(node.freq);
        dll.add(node);
    }

    private void removeLfuElement() {
        DoublyLinkedList dll = freqMapping.get(minFreq);
        int key = dll.removeLast();
        keyMapping.remove(key);
    }

    private void updateFreq(Node node) {
        DoublyLinkedList dll = freqMapping.get(node.freq);
        dll.remove(node);
        if (dll.length == 0 && minFreq == node.freq) {
            minFreq++;
        }

        node.incrementFreq();
        addNodeToFreqQueue(node);
    }

    public class DoublyLinkedList {
        Node head;
        Node tail;
        int length;

        public DoublyLinkedList() {
            length = 0;
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        public void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = node.next = null;
            this.length--;
            capacity++;
        }

        public void add(Node node) {
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
            this.length++;
            capacity--;
        }

        public int removeLast() {
            Node node = tail.prev;
            remove(node);
            return node.key;
        }
    }

    public class Node {
        int key;
        int value;
        int freq;
        Node next;
        Node prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.freq = 1;
        }

        public void incrementFreq() {
            this.freq++;
        }
    }
}