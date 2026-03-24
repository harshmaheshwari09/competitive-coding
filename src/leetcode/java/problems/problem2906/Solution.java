package leetcode.java.problems.problem2906;

/**
 * Ques: https://leetcode.com/problems/construct-product-matrix/description/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
class Solution {

    private final static int MOD = 12345;

    public int[][] constructProductMatrix(int[][] grid) {
        int product = 1;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] % MOD != 0) {
                    product = (product * grid[i][j]);
                } else {
                    count++;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (count > 1) {
                    grid[i][j] = 0;
                    continue;
                }

                if (count == 1) {
                    if (grid[i][j] % MOD != 0) {
                        grid[i][j] = 0;
                    } else {
                        grid[i][j] = product;
                    }
                    continue;
                }

                grid[i][j] = (product / grid[i][j]) % MOD;
            }
        }

        return grid;
    }
}
