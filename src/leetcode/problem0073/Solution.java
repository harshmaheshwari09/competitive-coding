package leetcode.problem0073;

public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean clearFirstRow = false, clearFirstCol = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i != 0 && j != 0) {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                        continue;
                    }
                    if (i == 0) {
                        clearFirstRow = true;
                    }
                    if (j == 0) {
                        clearFirstCol = true;
                    }
                }
            }
        }

        // setting rows to zero
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < matrix.length; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // setting col to zero
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < matrix[0].length; j++) {
                    matrix[i][i] = 0;
                }
            }
        }

        // clearing first row
        if (clearFirstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // clearing first column
        if (clearFirstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
