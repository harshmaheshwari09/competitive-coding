package leetcode.problem0416;

// https://leetcode.com/problems/partition-equal-subset-sum/
// #dp
public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int val : nums) {
            sum += val;
        }
        if (sum % 2 == 1) {
            return false;
        }
        int requiredSum = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][requiredSum + 1];
        return helper(nums, 0, requiredSum, dp);
    }

    public boolean helper(int[] nums, int idx, int sum, Boolean[][] dp) {
        if (sum == 0) {
            return true;
        }
        if (idx == nums.length || sum < 0) {
            return false;
        }
        if (dp[idx][sum] != null) {
            return dp[idx][sum];
        }
        return dp[idx][sum] = helper(nums, idx + 1, sum - nums[idx], dp) || helper(nums, idx + 1, sum, dp);
    }
}
