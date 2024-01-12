package leetcode.java.problems.problem2610;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
 * Tags: #array
 * Complexity: Time: O(N), Space: O(N)
 */
public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int value : nums) {
            numCount.put(value, numCount.getOrDefault(value, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (var entry : numCount.entrySet()) {
            for (int size = 0; size < entry.getValue(); size++) {
                if (size < ans.size()) {
                    ans.get(size).add(entry.getKey());
                } else {
                    ans.add(new ArrayList<>(List.of(entry.getKey())));
                }
            }
        }
        return ans;
    }
}
