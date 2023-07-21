package leetcode.java.problems.problem0036;

/**
 * Ques: https://leetcode.com/problems/valid-sudoku/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (!isInvalid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isInvalid(char[][] board, int i, int j) {
        // checking row
        for (int col = 0; col < 9; col++) {
            if (col != j && board[i][col] == board[i][j]) {
                return false;
            }
        }

        // checking col
        for (int row = 0; row < 9; row++) {
            if (row != i && board[row][j] == board[i][j]) {
                return false;
            }
        }

        // checking cell
        int startRow = i - (i % 3);
        int startCol = j - (j % 3);
        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                if (row != i && col != j && board[row][col] == board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
