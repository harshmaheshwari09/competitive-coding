package leetcode.java.problems.problem0684;

/**
 * Ques: https://leetcode.com/problems/redundant-connection
 * Tags: #graph, #union-find
 * Complexity: Time: O(n), Space: O(n)
 */
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int parent[] = new int[edges.length + 1];
        for (int i = 0; i <= edges.length; i++) {
            parent[i] = i;
        }
        int rank[] = new int[edges.length + 1];

        for (int edge[] : edges) {
            int parentX = find(edge[0], parent);
            int parentY = find(edge[1], parent);
            if (parentX == parentY) {
                return edge;
            }
            union(parentX, parentY, parent, rank);
        }

        return new int[]{};
    }

    private void union(int x, int y, int[] parent, int rank[]) {
        if (rank[x] >= rank[y]) {
            parent[y] = x;
            rank[x]++;
        } else {
            parent[x] = y;
            rank[y]++;
        }
    }

    private int find(int curr, int[] parent) {
        if (parent[curr] != curr) {
            return find(parent[curr], parent);
        }
        return curr;
    }
}