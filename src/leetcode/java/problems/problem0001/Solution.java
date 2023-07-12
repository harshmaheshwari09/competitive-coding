package leetcode.java.problems.problem0001;

import java.util.HashMap;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/two-sum/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (indexMap.containsKey(target - nums[idx])) {
                return new int[]{indexMap.get(target - nums[idx]), idx};
            }
            indexMap.put(nums[idx], idx);
        }
        return new int[0];
    }
}
