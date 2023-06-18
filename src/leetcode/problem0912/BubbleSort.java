package leetcode.problem0912;

import resources.Operations;

/**
 * Complexity: Time: O(n^2), Space: O(1)
 */
public class BubbleSort implements Sort {
    @Override
    public void performSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    Operations.swap(nums, j, j + 1);
                }
            }
        }
    }
}
