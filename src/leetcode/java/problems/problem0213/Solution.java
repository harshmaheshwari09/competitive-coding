package leetcode.java.problems.problem0213;

/**
 * Ques: https://leetcode.com/problems/house-robber-ii/description/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(helper(nums, 0, nums.length - 1), helper(nums, 1, nums.length));
    }

    private int helper(int[] nums, int start, int end) {
        int prevTaken = 0, prevNotTaken = 0;
        for (int i = start; i < end; i++) {
            int currTaken = prevNotTaken + nums[i];
            int currNotTaken = Math.max(prevTaken, prevNotTaken);

            prevTaken = currTaken;
            prevNotTaken = currNotTaken;
        }

        return Math.max(prevTaken, prevNotTaken);
    }
}
