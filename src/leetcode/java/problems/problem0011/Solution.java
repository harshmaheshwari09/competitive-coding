package leetcode.java.problems.problem0011;

/**
 * Ques: https://leetcode.com/problems/container-with-most-water/
 * Tags: #two_pointer
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left < right) {
            ans = Math.max(ans, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
