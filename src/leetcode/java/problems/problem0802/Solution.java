package leetcode.java.problems.problem0802;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/find-eventual-safe-states/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int inDegree[] = new int[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int des = 0; des < graph.length; des++) {
            inDegree[des] = graph[des].length;
            if (inDegree[des] == 0) {
                queue.offer(des);
            }
            for (int src : graph[des]) {
                if (!adj.containsKey(src)) {
                    adj.put(src, new ArrayList<>());
                }
                adj.get(src).add(des);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();
        while (queue.size() > 0) {
            int node = queue.poll();
            safeNodes.add(node);
            for (int neighbour : adj.getOrDefault(node, new ArrayList<>())) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    queue.offer(neighbour);
                }
            }
        }

        Collections.sort(safeNodes);
        return safeNodes;
    }
}
