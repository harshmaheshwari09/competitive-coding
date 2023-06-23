package leetcode.java.problems.problem0215;

import leetcode.java.util.Operations;

import java.util.Random;

/**
 * Ques: https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Tags: #
 * Complexity: Time: , Space:
 */
public class QuickSelectApproach {
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        k = nums.length - k;
        Random random = new Random();
        while (left < right) {
            int pivot = random.nextInt(right - left + 1) + left;
            int pos = quickSelect(nums, left, right, pivot);
            if (pos == k) {
                return nums[pos];
            }
            if (pos < k) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
        return nums[left];
    }

    private int quickSelect(int nums[], int left, int right, int pivot) {
        Operations.swap(nums, left, pivot);
        pivot = left++;
        while (left <= right) {
            while (left <= right && nums[pivot] < nums[right]) {
                right--;
            }
            while (left <= right && nums[left] <= nums[pivot]) {
                left++;
            }
            if (left < right) {
                Operations.swap(nums, left++, right--);
            }
        }
        Operations.swap(nums, pivot, right);
        return right;
    }
}
