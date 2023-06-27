package leetcode.java.problems.problem0542;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Ques: https://leetcode.com/problems/01-matrix
 * Tags: #bfs
 * Complexity: Time: O(m * n), Space: O(m * n)
 */
class Solution {

    private final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int[][] updateMatrix(int[][] mat) {
        int[][] ans = new int[mat.length][mat[0].length];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while (queue.size() > 0) {
            int[] curr = queue.poll();
            for (int[] direction : directions) {
                int x = curr[0] + direction[0];
                int y = curr[1] + direction[1];
                int newValue = 1 + ans[curr[0]][curr[1]];
                if (isBetter(x, y, ans, newValue)) {
                    ans[x][y] = 1 + newValue;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        return ans;
    }

    public boolean isBetter(int x, int y, int[][] ans, int newValue) {
        return (0 <= x && x < ans.length && 0 <= y && y < ans[0].length && newValue < ans[x][y]);
    }
}