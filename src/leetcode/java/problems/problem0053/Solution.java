package leetcode.java.problems.problem0053;

/**
 * Link: <a href="https://leetcode.com/problems/maximum-subarray/">LeetCode</a>
 * Tags: #array #dynamic-programming
 * Complexity: Time: O(n), Space: O(1)
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum, maxSumSoFar;
        maxSum = maxSumSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSumSoFar = Math.max(nums[i], maxSumSoFar + nums[i]);
            maxSum = Math.max(maxSum, maxSumSoFar);
        }
        return maxSum;
    }
}
