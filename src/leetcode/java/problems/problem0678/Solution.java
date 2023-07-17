package leetcode.java.problems.problem0678;

/**
 * Ques: https://leetcode.com/problems/valid-parenthesis-string/
 * Tags: #greedy
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;
        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(' -> {
                    leftMin++;
                    leftMax++;
                }
                case ')' -> {
                    leftMin = Math.max(0, leftMin - 1);
                    leftMax--;
                    if (leftMax < 0) {
                        return false;
                    }
                }
                case '*' -> {
                    leftMin = Math.max(0, leftMin - 1);
                    leftMax++;
                }
            }
        }
        return Math.min(leftMin, leftMax) == 0;
    }
}
