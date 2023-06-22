package leetcode.java.problems.problem0053;

/**
 * Ques: https://leetcode.com/problems/maximum-subarray/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(1)
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum, maxSumSoFar;
        maxSum = maxSumSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxSumSoFar = Math.max(nums[i], maxSumSoFar + nums[i]);
            maxSum = Math.max(maxSum ,maxSumSoFar);
        }
        return maxSum;
    }
}
