package leetcode.java.problems.problem0217;

import java.util.HashSet;
import java.util.Set;

/**
 * Ques: https://leetcode.com/problems/contains-duplicate/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int value : nums) {
            if (set.contains(value)) {
                return true;
            }
            set.add(value);
        }
        return false;
    }
}
