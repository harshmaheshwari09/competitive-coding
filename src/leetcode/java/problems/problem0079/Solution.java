package leetcode.java.problems.problem0079;

/**
 * Ques: https://leetcode.com/problems/word-search/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (isPresent(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }


    final int[][] DIRS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private boolean isPresent(char[][] board, int i, int j, String word, int idx) {
        if (idx == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i == board.length || j == board[i].length || board[i][j] != word.charAt(idx)) {
            return false;
        }

        char currChar = board[i][j];
        board[i][j] = '9';
        for (int[] dir : DIRS) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (isPresent(board, x, y, word, idx + 1)) {
                return true;
            }
        }
        board[i][j] = currChar;
        return false;
    }
}
