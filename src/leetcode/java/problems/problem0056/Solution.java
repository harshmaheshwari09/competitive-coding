package leetcode.java.problems.problem0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/merge-intervals/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])));
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            if (res.size() == 0 || res.get(res.size() - 1)[1] < interval[0]) {
                res.add(interval);
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], interval[1]);
            }
        }
        return res.toArray(new int[0][]);
    }
}
