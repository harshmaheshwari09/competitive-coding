package leetcode.java.problems.problem0169;

/**
 * Ques: https://leetcode.com/problems/majority-element/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == ans) {
                count++;
                continue;
            }
            count--;
            if (count == 0) {
                ans = nums[i];
                count = 1;
            }
        }
        return ans;
    }
}
