package leetcode.java.problems.problem0994;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/rotting-oranges/
// #bfs
public class Solution {

    int[][] neighbours = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        int ans = 0;
        while (queue.size() > 0) {
            int size = queue.size();
            while (size-- > 0) {
                int[] curr = queue.poll();
                for (var neighbour : neighbours) {
                    int x = curr[0] + neighbour[0];
                    int y = curr[1] + neighbour[1];
                    if (isFresh(grid, x, y)) {
                        grid[x][y] = 2;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            ans++;
        }

        // verify no orange is still fresh
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return Math.max(ans - 1, 0);
    }

    public boolean isFresh(int[][] grid, int x, int y) {
        if (x < 0 || x == grid.length || y < 0 || y == grid[0].length || grid[x][y] != 1) {
            return false;
        }
        return true;
    }
}
