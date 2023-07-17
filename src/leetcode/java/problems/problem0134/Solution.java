package leetcode.java.problems.problem0134;

/**
 * Ques: https://leetcode.com/problems/gas-station/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGain = 0, currentGain = 0, ans = 0;
        for (int idx = 0; idx < gas.length; idx++) {
            totalGain += gas[idx] - cost[idx];
            currentGain += gas[idx] - cost[idx];
            if (currentGain < 0) {
                ans = idx + 1;
                currentGain = 0;
            }
        }
        return totalGain >= 0 ? ans : -1;
    }
}
