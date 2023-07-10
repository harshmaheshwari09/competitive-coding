package leetcode.java.problems.problem0035;

/**
 * Ques: https://leetcode.com/problems/search-insert-position/
 * Tags: #binary_search
 * Complexity: Time: O(lgo(n)), Space: O(1)
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid  +1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
