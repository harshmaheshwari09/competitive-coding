package leetcode.java.problems.problem0128;

import java.util.HashSet;
import java.util.Set;

/**
 * Ques: https://leetcode.com/problems/longest-consecutive-sequence/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(n)
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        int ans = 1;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}