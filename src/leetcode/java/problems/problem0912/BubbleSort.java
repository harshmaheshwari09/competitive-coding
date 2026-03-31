package leetcode.java.problems.problem0912;

import leetcode.java.util.Operations;

/**
 * Repeatedly swaps adjacent out-of-order pairs until the array is sorted.
 * Complexity: Time: O(n^2) worst case, O(n) best case, Space: O(1)
 */
public class BubbleSort implements Sort {
    @Override
    public void performSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    Operations.swap(nums, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }
}
