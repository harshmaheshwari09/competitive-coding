package leetcode.java.problems.problem0121;

/**
 * Ques: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int maxPrice = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrice - prices[i]);
        }
        return maxProfit;
    }
}
