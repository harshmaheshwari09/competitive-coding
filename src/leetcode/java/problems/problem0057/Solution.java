package leetcode.java.problems.problem0057;

import java.util.ArrayList;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/insert-interval/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        // add all before
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i++]);
        }
        // merge all overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i++][1]);
        }
        result.add(newInterval);
        // add all after
        while (i < intervals.length) {
            result.add(intervals[i++]);
        }
        return result.toArray(new int[0][]);
    }
}
