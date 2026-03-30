# 56. MERGE INTERVALS

* Question: https://leetcode.com/problems/merge-intervals/
* Solution: [here](Solution.java)
* Tags: #array #sorting
* Complexity: Time: O(n log n), Space: O(n)

## Solution Explanation:

1. Sort all intervals by their start value, and by end value as a tie-breaker.

2. Traverse the sorted intervals from left to right while building the result list.

3. If the current interval does not overlap with the last merged interval, append it to the result.

4. Otherwise, merge them by extending the end of the last merged interval to the larger end value.

Sorting dominates the runtime, so the total time complexity is `O(n log n)`. The result list stores up to `n`
intervals, so the extra space complexity is `O(n)`.
