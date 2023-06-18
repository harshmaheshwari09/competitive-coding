package leetcode.java.problem0046;

import leetcode.java.resources.Operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ques: https://leetcode.com/problems/permutations/
 * tags: #backtrack
 * complexity: O(n!)
 */
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, result);
        return result;
    }

    public void helper(int[] nums, int start, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            result.add(new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList())));
            return;
        }
        for (int end = start; end < nums.length; end++) {
            Operations.swap(nums, start, end);
            helper(nums, start + 1, result);
            Operations.swap(nums, start, end);
        }
    }
}
