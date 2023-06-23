package leetcode.java.problems.problem0031;

import leetcode.java.util.Operations;

/**
 * Ques: https://leetcode.com/problems/next-permutation/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        int left = nums.length - 2;
        while (left >= 0 && nums[left] >= nums[left + 1]) {
            left--;
        }
        if (left >= 0) {
            int right = nums.length - 1;
            while (right > left && nums[right] <= nums[left]) {
                right--;
            }
            Operations.swap(nums, left, right);
        }
        Operations.reverse(nums, left + 1, nums.length - 1);
    }
}
