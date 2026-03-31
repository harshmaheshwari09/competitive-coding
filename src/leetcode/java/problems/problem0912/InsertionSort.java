package leetcode.java.problems.problem0912;

import leetcode.java.util.Operations;

/**
 * Inserts each element into the already-sorted prefix by swapping it leftward.
 * Complexity: Time: O(n^2) worst case, O(n) best case, Space: O(1)
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
