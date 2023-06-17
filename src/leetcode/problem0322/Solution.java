package leetcode.problem0322;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ques: https://leetcode.com/problems/coin-change/
 * tags: #bfs
 * complexity: O(n)
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(amount);
        boolean[] vis = new boolean[amount + 1];
        vis[amount] = true;

        int ans = 1;
        while (queue.size() > 0) {
            int size = queue.size();
            while (size-- > 0) {
                int curr = queue.poll();
                for (int value : coins) {
                    int next = curr - value;
                    if (next == 0) {
                        return ans;
                    }
                    if (next > 0 && !vis[next]) {
                        vis[next] = true;
                        queue.offer(next);
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}
