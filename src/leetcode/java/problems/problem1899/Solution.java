package leetcode.java.problems.problem1899;

/**
 * Ques: https://leetcode.com/problems/merge-triplets-to-form-target-triplet/
 * Tags: #greedy
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] actual = {0, 0, 0};
        for (int[] curr : triplets) {
            if (curr[0] <= target[0] && curr[1] <= target[1] && curr[2] <= target[2]) {
                actual[0] = Math.max(actual[0], curr[0]);
                actual[1] = Math.max(actual[1], curr[1]);
                actual[2] = Math.max(actual[2], curr[2]);

                if (actual[0] == target[0] && actual[1] == target[1] && actual[2] == target[2]) {
                    return true;
                }
            }
        }
        return false;
    }
}
