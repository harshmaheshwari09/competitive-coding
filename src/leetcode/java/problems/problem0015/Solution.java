package leetcode.java.problems.problem0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/3sum/
 * Tags: #array
 * Complexity: Time: O(n^2), Space: O(1)
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int target = nums[i] + nums[left] + nums[right];
                if ( target == 0) {
                    ans.add(List.of(nums[i], nums[left++], nums[right--]));
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (target < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}
