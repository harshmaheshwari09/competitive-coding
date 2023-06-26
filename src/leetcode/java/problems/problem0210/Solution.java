package leetcode.java.problems.problem0210;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/course-schedule-ii
 * Tags: #graph, #topological_sort
 * Complexity: Time: O(V+E), Space: O(V)
 */
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] inDegree = new int[numCourses];
        for (var preReq : prerequisites) {
            int src = preReq[1], des = preReq[0];
            if (!adj.containsKey(src)) {
                adj.put(src, new ArrayList<>());
            }
            adj.get(src).add(des);
            inDegree[des]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int idx = 0;
        int[] ans = new int[numCourses];
        while (queue.size() > 0) {
            int node = queue.poll();
            ans[idx++] = node;
            for (int neighbour : adj.getOrDefault(node, new ArrayList<>())) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }
        }
        return (idx == numCourses ? ans : new int[]{});
    }
}