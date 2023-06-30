package leetcode.java.problems.problem0743;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/network-delay-time
 * Tags: #bfs
 * Complexity: Time: O(V * E), Space: O(V * E)
 */
public class Solution {

    public int networkDelayTime(int[][] times, int n, int k) {
        int[] transmissionTime = new int[n];
        for (int i = 0; i < n; i++) {
            transmissionTime[i] = Integer.MAX_VALUE;
        }
        transmissionTime[k-1] = 0;

        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] edge : times) {
            int src = edge[0] - 1;
            int des = edge[1] - 1;
            int time = edge[2];
            if (!adj.containsKey(src)) {
                adj.put(src, new ArrayList<>());
            }
            adj.get(src).add(new int[]{des, time});
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k-1);
        while (queue.size() > 0) {
            int curr = queue.poll();
            for (int[] neigh : adj.getOrDefault(curr, new ArrayList<>())) {
                if (transmissionTime[curr] + neigh[1] < transmissionTime[neigh[0]]) {
                    transmissionTime[neigh[0]] = transmissionTime[curr] + neigh[1];
                    queue.offer(neigh[0]);
                }
            }
        }

        int maxTransmissionTime = 0;
        for (int i = 0; i < n; i++) {
            maxTransmissionTime = Math.max(maxTransmissionTime, transmissionTime[i]);
        }

        return maxTransmissionTime == Integer.MAX_VALUE ? -1 : maxTransmissionTime;
    }
}
