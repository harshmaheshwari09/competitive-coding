package leetcode.java.problems.problem0785;

/**
 * Ques: https://leetcode.com/problems/is-graph-bipartite/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        Boolean color[] = new Boolean[n];
        for (int i = 0; i < n; i++) {
            if (!canDivide(graph, i, color)) {
                return false;
            }
        }
        return true;
    }

    private boolean canDivide(int[][] graph, int node, Boolean[] color) {
        if (color[node] == null) {
            color[node] = true;
        }
        for (int neigh : graph[node]) {
            if (color[neigh] == null) {
                color[neigh] = !color[node];
                if (!canDivide(graph, neigh, color)) {
                    return false;
                }
            }
            if (color[neigh] == color[node]) {
                return false;
            }
        }
        return true;
    }
}
