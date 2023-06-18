package leetcode.java.problem0289;

class Solution {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int liveNeighbours = getLiveNeighbours(board, i, j);
                if (board[i][j] == 1 && (liveNeighbours < 2 || liveNeighbours > 3)) {
                    board[i][j] = 2;
                    continue;
                }

                if (board[i][j] == 0 && liveNeighbours == 3) {
                    board[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
                if (board[i][j] == -1) {
                    board[i][j] = 1;
                }
            }
        }
    }

    int[][] neighbours = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public int getLiveNeighbours(int[][] grid, int i, int j) {
        int count = 0;
        for (var neighbour : neighbours) {
            int x = i + neighbour[0];
            int y = j + neighbour[1];
            if (isLive(grid, x, y)) {
                count++;
            }
        }
        return count;
    }

    public boolean isLive(int grid[][], int x, int y) {
        if (x < 0 || x == grid.length || y < 0 || y == grid[x].length || grid[x][y] <= 0) {
            return false;
        }
        return true;
    }
}