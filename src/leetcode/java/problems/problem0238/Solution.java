package leetcode.java.problems.problem0238;

/**
 * Ques: https://leetcode.com/problems/product-of-array-except-self/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int left = 1, right = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }
        return ans;
    }
}
