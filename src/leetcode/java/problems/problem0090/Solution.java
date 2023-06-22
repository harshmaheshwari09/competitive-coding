package leetcode.java.problems.problem0090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/subsets-ii/
 * Tags: #backtracking
 * Complexity: Time: O(n!), Space: O(1)
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(nums, 0, subset, subsets);
        return subsets;
    }

    private void helper(int[] nums, int i, List<Integer> subset, List<List<Integer>> subsets) {
        // base case
        if (i == nums.length) {
            subsets.add(new ArrayList<>(subset));
            return;
        }

        // set
        subset.add(nums[i]);
        helper(nums, i + 1, subset, subsets);

        // unset
        subset.remove(subset.size() - 1);
        i++;
        while (i < nums.length && nums[i] == nums[i - 1]) {
            i++;
        }
        helper(nums, i, subset, subsets);
    }
}
