package leetcode.java.problems.problem0130;

/**
 * Ques: https://leetcode.com/problems/surrounded-regions
 * Tags: #graph
 * Complexity: Time: O(n^2), Space: O(1)
 */
class Solution {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((i == 0 || i == board.length - 1 || j == 0 || j == board[0].length - 1) && board[i][j] == 'O') {
                    dfs(i, j, board);
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = (board[i][j] == 'B' ? 'O' : 'X');
            }
        }
    }

    private final static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private void dfs(int i, int j, char[][] board) {
        if (!isSafe(i, j, board)) {
            return;
        }
        board[i][j] = 'B';
        for (int[] direction : directions) {
            dfs(i + direction[0], j + direction[1], board);
        }
    }

    private boolean isSafe(int i, int j, char[][] board) {
        if (i < 0 || i == board.length || j < 0 || j == board[0].length || board[i][j] != 'O') {
            return false;
        }
        return true;
    }
}