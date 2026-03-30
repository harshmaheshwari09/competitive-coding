package leetcode.java.problems.problem0075;

import leetcode.java.util.Operations;

/**
 * Link: <a href="https://leetcode.com/problems/sort-colors/">LeetCode</a>
 * Tags: #array #two-pointers #sorting
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public void sortColors(int[] nums) {
        int zeroPtr = 0, onePtr = 0, twoPtr = nums.length - 1;
        while (onePtr <= twoPtr) {
            if (nums[onePtr] == 0) {
                Operations.swap(nums, zeroPtr++, onePtr++);
            } else if (nums[onePtr] == 1) {
                onePtr++;
            } else {
                Operations.swap(nums, onePtr, twoPtr--);
            }
        }
    }
}
