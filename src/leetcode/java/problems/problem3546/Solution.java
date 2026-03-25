package leetcode.java.problems.problem3546;

/**
 * Ques: https://leetcode.com/problems/equal-sum-grid-partition-i/description/
 * Tags: #array #matrix #enumeration #prefix_sum
 * Complexity: Time: O(m*n), Space: O(1)
 */
class Solution {

    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long totalSum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += grid[i][j];
            }
        }
        if (totalSum % 2 != 0) {
            return false;
        }
        long halfSum = totalSum / 2;

        // horizontal cut check (cut after row i)
        long sum = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
            }
            if (sum == halfSum) {
                return true;
            }
        }

        // vertical cut check (cut after column j)
        sum = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) {
                sum += grid[i][j];
            }
            if (sum == halfSum) {
                return true;
            }
        }

        return false;
    }
}