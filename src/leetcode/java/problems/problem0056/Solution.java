package leetcode.java.problems.problem0056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Ques: <a href="https://leetcode.com/problems/merge-intervals/">...</a>
 * Tags: #array #sorting
 * Complexity: Time: O(n log n), Space: O(n)
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])));
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            if (res.isEmpty() || res.getLast()[1] < interval[0]) {
                res.add(interval);
            } else {
                res.getLast()[1] = Math.max(res.getLast()[1], interval[1]);
            }
        }
        return res.toArray(new int[0][]);
    }
}
