package leetcode.java.problems.problem0219;

import java.util.HashSet;
import java.util.Set;

/**
 * Ques: https://leetcode.com/problems/contains-duplicate-ii/
 * Tags: #sliding_window
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
