package leetcode.java.problems.problem0045;

/**
 * Ques: https://leetcode.com/problems/jump-game-ii/
 * Tags: #greedy
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int far = 0, end = 0, jump = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if (idx + nums[idx] >= nums.length - 1) {
                return jump + 1;
            }
            far = Math.max(far, idx + nums[idx]);
            if (end == idx) {
                end = far;
                jump++;
            }
        }
        return -1;
    }
}
