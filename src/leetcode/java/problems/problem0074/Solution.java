package leetcode.java.problems.problem0074;

/**
 * Ques: https://leetcode.com/problems/search-a-2d-matrix/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int val = getValue(mid, n, matrix);
            if (val == target) {
                return true;
            }
            if (val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    private int getValue(int idx, int cols, int[][] matrix) {
        int i = idx / cols;
        int j = idx % cols;
        return matrix[i][j];
    }
}


