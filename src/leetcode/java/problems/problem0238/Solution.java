package leetcode.java.problems.problem0238;

import java.util.Arrays;

/**
 * Ques: https://leetcode.com/problems/product-of-array-except-self/description/
 * Tags: #prefix #suffix
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        // prefix calculation
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] *= product;
            product *= nums[i];
        }
        // suffix calculation
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= product;
            product *= nums[i];
        }
        return ans;
    }
}
