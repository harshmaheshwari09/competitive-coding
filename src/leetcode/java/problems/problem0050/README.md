# 50. POW(X, N)

* Question: [LeetCode](https://leetcode.com/problems/powx-n/description/)
* Solution: [here](Solution.java)
* Testing: [here](SolutionTest.java)
* Tags: #math #recursion
* Complexity: Time: O(log n), Space: O(1)

## Solution Explanation:

1. Use binary exponentiation to reduce the exponent by half at each step instead of multiplying `x` exactly `n` times.

2. Convert `n` to a `long` first so negating `Integer.MIN_VALUE` does not overflow.

3. If the exponent is negative, invert the base and work with the positive exponent.

4. Repeatedly square the base and multiply it into the answer whenever the current exponent bit is `1`.

Because the exponent is halved each iteration, the runtime is `O(log n)` and the extra space is `O(1)`.
