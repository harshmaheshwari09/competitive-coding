package leetcode.java.problems.problem0703;

import java.util.PriorityQueue;

/**
 * Ques: https://leetcode.com/problems/kth-largest-element-in-a-stream/
 * Tags: #heap
 * Complexity: Time: O(nLog(k)), Space: O(k)
 */
class KthLargest {

    PriorityQueue<Integer> pq;
    int capacity;

    public KthLargest(int k, int[] nums) {
        capacity = k;
        pq = new PriorityQueue<>();
        for (int val : nums) {
            add(val);
        }
    }

    public int add(int val) {
        if (pq.size() < capacity || val > pq.peek() ) {
            pq.offer(val);
        }
        if (pq.size() > capacity) {
            pq.poll();
        }
        return pq.peek();
    }
}