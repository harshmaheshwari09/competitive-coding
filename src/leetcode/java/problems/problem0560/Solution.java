package leetcode.java.problems.problem0560;

import java.util.HashMap;
import java.util.Map;

/**
 * Ques: <a href="https://leetcode.com/problems/subarray-sum-equals-k/description/">...</a>
 * Tags: #array #hashmap #prefix_sum
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumFrequency = new HashMap<>();
        prefixSumFrequency.put(0, 1);

        int prefixSum = 0;
        int count = 0;
        for (int num : nums) {
            prefixSum += num;
            count += prefixSumFrequency.getOrDefault(prefixSum - k, 0);
            prefixSumFrequency.put(prefixSum, prefixSumFrequency.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
