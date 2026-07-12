package leetcode.java.problems.problem0050;

/**
 * Link: <a href="https://leetcode.com/problems/powx-n/description/">LeetCode</a>
 * Tags: #math #recursion
 * Complexity: Time: O(log n), Space: O(1)
 */
public class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1 || x == 0 || x == 1) {
            return x;
        }
        if (n < 0) {
            return (1 / x) * myPow(1 / x, (n + 1) * -1);
        }
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }
        return x * myPow(x, n - 1);
    }
}
