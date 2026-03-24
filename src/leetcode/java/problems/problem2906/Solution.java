package leetcode.java.problems.problem2906;

import java.util.Arrays;

/**
 * Ques: https://leetcode.com/problems/construct-product-matrix/description/
 * Tags: #prefix #suffix
 * Complexity: Time: O(n*m), Space: O(1)
 */
class Solution {

    private final static int MOD = 12345;

    public int[][] constructProductMatrix(int[][] grid) {
        int[][] ans = new int[grid.length][grid[0].length];
        for (int[] row : ans) {
            Arrays.fill(row, 1);
        }
        // prefix calculation
        long product = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans[i][j] = (int) (ans[i][j] * product);
                product = (product * grid[i][j]) % MOD;
            }
        }

        // suffix calculation
        product = 1;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                ans[i][j] = (int) (((long)ans[i][j] * product) % MOD);
                product = (product * grid[i][j]) % MOD;
            }
        }
        return ans;
    }
}
