package leetcode.java.problem0912;

import leetcode.java.model.Operations;

/**
 * Complexity: Time: O(n^2), Space: O(1)
 */
public class SelectionSort implements Sort {
    @Override
    public void performSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    Operations.swap(nums, i, j);
                }
            }
        }
    }
}
