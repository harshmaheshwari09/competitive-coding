package leetcode.java.problems.problem0039;

import java.util.ArrayList;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/combination-sum/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int idx, int target, List<Integer> list, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        if (idx == candidates.length || target < 0) {
            return;
        }

        list.add(candidates[idx]);
        backtrack(candidates, idx, target - candidates[idx], list, result);

        list.remove(list.size() - 1);
        backtrack(candidates, idx + 1, target, list, result);
    }


}
