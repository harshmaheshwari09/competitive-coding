package leetcode.java.problems.problem0055;

/**
 * Ques: https://leetcode.com/problems/jump-game/
 * Tags: #greedy
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length - 1;
        for (int idx = nums.length - 2; idx >= 0; idx++) {
            if (idx + nums[idx] >= last) {
                last = idx;
            }
        }
        return last == 0;
    }
}
