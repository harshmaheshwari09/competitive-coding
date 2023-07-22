package leetcode.java.problems.problem0078;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/subsets/
 * Tags: #backtracking
 * Complexity: Time: O(n!), Space: O(1)
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int idx, List<Integer> subset, List<List<Integer>> subsets) {
        if (idx == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[idx]);
        backtrack(nums, idx + 1, subset, subsets);

        int val = subset.remove(subset.size() - 1);
        while (idx < nums.length && val == nums[idx]) {
            idx++;
        }
        backtrack(nums, idx, subset, subsets);
    }
}
