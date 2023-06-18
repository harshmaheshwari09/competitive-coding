package leetcode.java.problem0051;

import java.util.ArrayList;
import java.util.List;

/**
 * ques: https://leetcode.com/problems/n-queens/
 * tags: #backtrack
 * complexity: Time: O(n!), Space: O(n^2)
 */
public class Solution {

    boolean[][] board;

    public List<List<String>> solveNQueens(int n) {
        this.board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        helper(0, 0, 0, 0, result);
        return result;
    }

    public void helper(int row, int column, int positiveDiag, int negativeDiag, List<List<String>> result) {
        if (row == this.board.length) {
            result.add(createBoard());
        }

        for (int col = 0; col < this.board.length; col++) {
            if (isSafe(row, col, column, positiveDiag, negativeDiag)) {
                // set
                this.board[row][col] = true;
                column ^= (1 << col);
                positiveDiag ^= (1 << (row + col));
                negativeDiag ^= (1 << (this.board.length - 1 + row - col));

                // recurse
                helper(row + 1, column, positiveDiag, negativeDiag, result);

                // unset
                this.board[row][col] = false;
                column ^= (1 << col);
                positiveDiag ^= (1 << (row + col));
                negativeDiag ^= (1 << (this.board.length - 1 + row - col));
            }
        }
    }

    public boolean isSafe(int currRow, int currCol, int column, int positiveDiag, int negativeDiag) {
        if ((column & (1 << currCol)) != 0) {
            return false;
        }

        if ((positiveDiag & (1 << (currRow + currCol))) != 0) {
            return false;
        }

        if ((negativeDiag & (1 << (this.board.length - 1 + currRow - currCol))) != 0) {
            return false;
        }

        return true;
    }

    public List<String> createBoard() {
        List<String> solBoard = new ArrayList<>();
        for (int i = 0; i < this.board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < this.board.length; j++) {
                sb.append(this.board[i][j] ? "Q" : ".");
            }
            solBoard.add(sb.toString());
        }
        return solBoard;
    }
}
