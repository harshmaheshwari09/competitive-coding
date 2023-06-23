# 121. BEST TIME TO BUY AND SELL STOCK

* Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #array
* Complexity: Time: O(n), Space: O(1)

## Solution Explanation:

1. Initialize maxProfit to 0 and set maxPrice to the last element of the prices array. These variables keep track of the
   maximum profit and the maximum price encountered.

2. Iterate over the prices array in reverse, starting from the second-to-last element and moving towards the first
   element.

3. Update maxPrice by taking the maximum between the current maxPrice and the price at the current position.

4. Calculate the potential profit by subtracting the current price from maxPrice.

5. Update maxProfit by taking the maximum between the current maxProfit and the potential profit.

6. Return maxProfit as the final result.

By traversing the array from the end, we obtain information about the maximum future price at each position. This allows
us to determine the maximum profit that can be obtained by buying a stock at a given position and selling it at the
highest possible price in the future.
