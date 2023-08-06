package leetcode.java.problems.problem0435;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Ques: https://leetcode.com/problems/non-overlapping-intervals/description/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans = 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i+1][0]) {
                ans++;
                intervals[i+1][1] = Math.min(intervals[i+1][1], intervals[i][1]);
            }
        }
        return ans;
    }
}
