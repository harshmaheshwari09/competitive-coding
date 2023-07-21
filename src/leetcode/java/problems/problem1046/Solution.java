package leetcode.java.problems.problem1046;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Ques: https://leetcode.com/problems/last-stone-weight/
 * Tags: #heap
 * Complexity: Time: O(nlog(n)), Space: O(n)
 */
public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int newStone = Math.abs(pq.poll() - pq.poll());
            if (newStone > 0) {
                pq.offer(newStone);
            }
        }
        return pq.size() > 0 ? pq.poll() : 0;
    }
}
