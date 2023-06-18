package leetcode.java.problem0912;

import leetcode.java.resources.Operations;

import java.util.Random;

/**
 * Complexity: Time: O(nLog(n)), Space: O(1)
 */
public class QuickSort implements Sort {
    @Override
    public void performSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int pivot = rearrange(nums, l, r);
        quickSort(nums, l, pivot - 1);
        quickSort(nums, pivot + 1, r);
    }

    public int rearrange(int nums[], int l, int r) {
        Random random = new Random();
        int pivot = l + random.nextInt(r - l + 1);
        Operations.swap(nums, l, pivot);
        pivot = l++;

        while (l <= r) {
            while (l <= r && nums[r] > nums[pivot]) {
                r--;
            }

            while (l <= r && nums[l] <= nums[pivot]) {
                l++;
            }

            if (l < r) {
                Operations.swap(nums, l++, r--);
            }
        }
        Operations.swap(nums, pivot, r);

        return r;
    }
}
