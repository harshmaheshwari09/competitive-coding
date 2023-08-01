package leetcode.java.problems.problem0198;

/**
 * Ques: https://leetcode.com/problems/house-robber/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int rob(int[] nums) {
        int prevTaken = 0, prevNotTaken = 0;
        for (int val : nums) {
            int currTaken = prevNotTaken + val;
            int currNotTaken = Math.max(prevTaken, prevNotTaken);

            prevTaken = currTaken;
            prevNotTaken = currNotTaken;
        }

        return Math.max(prevTaken, prevNotTaken);
    }
}
