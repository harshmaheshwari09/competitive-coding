package leetcode.java.problems.problem0167;

/**
 * Ques: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
