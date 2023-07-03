package leetcode.java.problems.problem0859;

/**
 * Ques: https://leetcode.com/problems/buddy-strings/
 * Tags: #string
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        // s and goal are same.
        if (s.equals(goal)) {
            int freq[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                int idx = s.charAt(i) - 'a';
                if (freq[idx] == 1) {
                    return true;
                }
                freq[idx]++;
            }
            return false;
        }

        int firstIdx = -1, secondIdx = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (firstIdx == -1) {
                    firstIdx = i;
                } else if (secondIdx == -1) {
                    secondIdx = i;
                } else {
                    // more than 2 diff chars
                    return false;
                }
            }
        }

        if (secondIdx == -1) {
            return false;
        }

        return s.charAt(firstIdx) == goal.charAt(secondIdx) && s.charAt(secondIdx) == goal.charAt(firstIdx);
    }
}
