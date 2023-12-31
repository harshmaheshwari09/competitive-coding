package leetcode.java.problems.problem0075;

import leetcode.java.util.Operations;

/**
 * ques: https://leetcode.com/problems/sort-colors/
 * tags: #two_pointer
 * complexity: O(n)
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
