package leetcode.java.problems.problem0841;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/keys-and-rooms/
 * Tags: #bfs
 * Complexity: Time: O(n^2), Space: O(n)
 */
public class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keyVisited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while (queue.size() > 0) {
            int key = queue.poll();
            keyVisited.add(key);
            for (int neighbour : rooms.get(key)) {
                if (!keyVisited.contains(neighbour)) {
                    keyVisited.add(neighbour);
                    queue.offer(neighbour);
                }
            }
        }
        return keyVisited.size() == rooms.size();
    }
}
