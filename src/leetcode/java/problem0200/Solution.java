package leetcode.java.problem0200;

/**
 * ques: https://leetcode.com/problems/number-of-islands/description/
 * tags: #dfs
 * complexity: O(n^2)
 */
public class Solution {

    int[][] neighbours = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int numIslands(char[][] grid) {
        int isLandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    isLandCount++;
                    dfs(grid, i, j);
                }
            }
        }
        return isLandCount;
    }

    public void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        for (var neighbour : neighbours) {
            int x = i + neighbour[0];
            int y = j + neighbour[1];
            if (isLand(grid, x, y)) {
                dfs(grid, x, y);
            }
        }
    }

    public boolean isLand(char[][] grid, int x, int y) {
        if (x < 0 || x == grid.length || y < 0 || y == grid[0].length || grid[x][y] == '0') {
            return false;
        }
        return true;
    }
}
