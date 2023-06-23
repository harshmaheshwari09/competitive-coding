package leetcode.java.problems.problem0215;

import java.util.PriorityQueue;

/**
 * Ques: https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Tags: #
 * Complexity: Time: , Space:
 */
public class MinHeapApproach {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int val : nums) {
            if (minHeap.size() < k || minHeap.peek() < val) {
                minHeap.offer(val);
            }
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
