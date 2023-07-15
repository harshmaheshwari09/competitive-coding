package leetcode.java.problems.problem0042;

/**
 * Ques: https://leetcode.com/problems/trapping-rain-water/
 * Tags: #two_pointer
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, maxHeightLeft = 0, maxHeightRight = 0, trappedWater = 0;
        while (left < right) {
            maxHeightLeft = Math.max(maxHeightLeft, height[left]);
            maxHeightRight = Math.max(maxHeightRight, height[right]);
            if (height[left] < height[right]) {
                trappedWater += maxHeightLeft - height[left++];
            } else {
                trappedWater += maxHeightRight - height[right--];
            }
        }
        return trappedWater;
    }
}
