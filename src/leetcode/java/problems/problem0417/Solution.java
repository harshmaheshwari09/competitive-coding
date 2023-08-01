package leetcode.java.problems.problem0417;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Ques: https://leetcode.com/problems/pacific-atlantic-water-flow/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean[heights.length][heights[0].length];
        buildPacific(heights, pacific);
        boolean[][] atlantic = new boolean[heights.length][heights[0].length];
        buildAtlantic(heights, atlantic);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (atlantic[i][j] && pacific[i][j]) {
                    ans.add(List.of(i, j));
                }
            }
        }
        return ans;
    }

    private void buildAtlantic(int[][] heights, boolean[][] atlantic) {
        Queue<int[]> q = new LinkedList<>();
        for (int row = 0; row < heights.length; row++) {
            q.offer(new int[]{row, heights[0].length - 1});
            atlantic[row][heights[0].length - 1] = true;
        }
        for (int col = 0; col < heights[0].length; col++) {
            q.offer(new int[]{ heights.length - 1, col});
            atlantic[heights.length - 1][col] = true;
        }

        bfs(heights, q, atlantic);
    }

    private void buildPacific(int[][] heights, boolean[][] pacific) {
        Queue<int[]> q = new LinkedList<>();
        for (int row = 0; row < heights.length; row++) {
            q.offer(new int[]{row, 0});
            pacific[row][0] = true;
        }
        for (int col = 0; col < heights[0].length; col++) {
            q.offer(new int[]{ 0, col});
            pacific[0][col] = true;
        }

        bfs(heights, q, pacific);
    }

    final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private void bfs(int[][] heights, Queue<int[]> q, boolean[][] ocean) {
        while (q.size() > 0) {
            int[] currCell = q.poll();
            for (int[] dir : DIRS) {
                int x = currCell[0] + dir[0];
                int y = currCell[1] + dir[1];
                if (isSafe(heights, x, y) && !ocean[x][y] && heights[x][y] >= heights[currCell[0]][currCell[1]]) {
                    ocean[x][y] = true;
                    q.offer(new int[]{x, y});
                }
            }
        }
    }

    private boolean isSafe(int[][] heights, int x, int y) {
        if (x < 0 || x == heights.length || y < 0 || y == heights[0].length) {
            return false;
        }
        return true;
    }
}
