package leetcode.java.problems.problem0091;

/**
 * Ques: https://leetcode.com/problems/decode-ways/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {

    public int numDecodings(String s) {
        int twoForward = 1; // empty string
        int oneForward = s.charAt(s.length() - 1) == '0' ? 0 : 1;
        for (int i = s.length() - 2; i >= 0; i--) {
            int current = 0;
            if (s.charAt(i) != '0') {
                current += oneForward;
            }

            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
                current += twoForward;
            }

            twoForward = oneForward;
            oneForward = current;
        }
        return oneForward;
    }
}
