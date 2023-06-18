package leetcode.java.problem0912;

import leetcode.java.resources.Operations;

/**
 * Complexity: Time: O(n^2), Space: O(1)
 */
public class InsertionSort implements Sort {
    @Override
    public void performSort(int[] nums) {
        next:
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] > nums[j - 1]) {
                    continue next;
                }
                Operations.swap(nums, j, j - 1);
            }
        }
    }
}
