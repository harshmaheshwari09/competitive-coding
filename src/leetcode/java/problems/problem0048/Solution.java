package leetcode.java.problems.problem0048;

/**
 * Boilerplate for LeetCode problem: Rotate Image
 * Link: <a href="https://leetcode.com/problems/rotate-image/description/">...</a>
 * <p>
 * Expected Time Complexity: O(n^2)
 * Expected Space Complexity: O(1)
 * <p>
 * Tags: Array, Math, Matrix
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // mirror
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                swap(matrix, i, left, i, right);
                left++;
                right--;
            }
        }

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                swap(matrix, i, j, n- j - 1, n - i - 1);
            }
        }
    }

    public void swap(int[][] matrix, int i, int j, int x, int y) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }
}
