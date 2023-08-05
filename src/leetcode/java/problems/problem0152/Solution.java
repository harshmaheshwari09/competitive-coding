package leetcode.java.problems.problem0152;

/**
 * Ques: https://leetcode.com/problems/maximum-product-subarray/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = 1, min = 1;
        for (int val : nums) {
            int curr = max * val;
            max = Math.max(val, Math.max(curr, min * val));
            min = Math.min(val, Math.min(curr, min * val));
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
