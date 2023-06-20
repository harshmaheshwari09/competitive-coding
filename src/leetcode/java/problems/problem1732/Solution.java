package leetcode.java.problems.problem1732;

/**
 * ques: https://leetcode.com/problems/find-the-highest-altitude/
 * tags: #array
 * complexity: Time: O(n), Space(1)
 */
public class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int sum = 0;
        for (int dis : gain) {
            sum += dis;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
