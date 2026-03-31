package leetcode.java.problems.problem2965;

/**
 * Link: <a href="https://leetcode.com/problems/find-missing-and-repeated-values/description/">LeetCode</a>
 * Tags: #array #math #matrix
 * Complexity: Time: O(n^2), Space: O(1)
 */
public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = grid.length;
        long totalNumbers = n * n;
        long sumDiff = totalNumbers * (totalNumbers + 1) / 2;
        long sumSqDiff = totalNumbers * (totalNumbers + 1) * (2 * totalNumbers + 1) / 6;

        for (int[] row : grid) {
            for (int value : row) {
                sumDiff -= value;
                sumSqDiff -= (long) value * value;
            }
        }

        long repeated = (sumSqDiff / sumDiff - sumDiff) / 2;
        long missing = repeated + sumDiff;
        return new int[]{(int) repeated, (int) missing};
    }
}
