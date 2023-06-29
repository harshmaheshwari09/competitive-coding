package leetcode.java.problems.problem0733;

/**
 * Ques: https://leetcode.com/problems/flood-fill/
 * Tags: #dfs, #graph
 * Complexity: Time: O(m*n), Space: O(m*n)
 */
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color != image[sr][sc]) {
            helper(image, sr, sc, color, image[sr][sc]);
        }
        return image;
    }

    private final static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private void helper(int[][] image, int i, int j, int newColor, int reqColor) {
        if (!isSafe(image, i, j, reqColor)) {
            return;
        }
        image[i][j] = newColor;
        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];
            helper(image, x, y, newColor, reqColor);
        }
    }

    private boolean isSafe(int[][] image, int i, int j, int reqColor) {
        if (i < 0 || i == image.length || j < 0 || j == image[0].length || image[i][j] != reqColor) {
            return false;
        }
        return true;
    }
}