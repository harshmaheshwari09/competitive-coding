package leetcode.java.problems.problem0909;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int snakesAndLadders(int[][] board) {
        boolean[] vis = new boolean[board.length * board.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        vis[0] = true;
        int ans = 1;
        while (queue.size() > 0) {
            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();
                for (int i = 1; i <= 6; i++) {
                    int next = getNext(curr + i, board);
                    if (next >= board.length * board.length - 1) {
                        return ans;
                    }
                    if (!vis[next]) {
                        queue.offer(next);
                        vis[next] = true;
                    }
                }
            }
            ans++;
        }
        return -1;
    }

    public int getNext(int next, int[][] board) {
        if (next >= board.length * board.length - 1) {
            return next;
        }
        int[] coordinates = getCoordinates(next, board.length);
        return (board[coordinates[0]][coordinates[1]] != -1 ? board[coordinates[0]][coordinates[1]] - 1 : next);
    }

    public int[] getCoordinates(int curr, int size) {
        int x = size - 1 - (curr / size);
        int y = ((curr / size) % 2 == 0 ? curr % size : size - 1 - (curr % size));
        return new int[]{x, y};
    }
}
