package leetcode.java.problems.problem0540;

/**
 * Ques: https://leetcode.com/problems/single-element-in-a-sorted-array/
 * Tags: #binary_search
 * Complexity: Time: O(log(n)), SpaceO(1)
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((mid == 0 || nums[mid - 1] != nums[mid]) && (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }
            if (shouldMoveLeft(mid, nums)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

    private boolean shouldMoveLeft(int mid, int[] nums) {
        return (mid % 2 == 1 && mid < nums.length - 1 && nums[mid] == nums[mid + 1]) // odd and first occurrence.
            || (mid % 2 == 0 && mid > 0 && nums[mid] == nums[mid - 1]); // even and second occurrence.
    }
}
