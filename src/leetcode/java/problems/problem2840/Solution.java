package leetcode.java.problems.problem2840;

/**
 * Link: <a href="https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/description/">LeetCode</a>
 * Tags: #hash-table #string #sorting
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] evenChar = new int[26];
        int[] oddChar = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                evenChar[s1.charAt(i) - 'a']++;
            } else {
                oddChar[s1.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (i % 2 == 0) {
                evenChar[s2.charAt(i) - 'a']--;
            } else {
                oddChar[s2.charAt(i) - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (evenChar[i] != 0 || oddChar[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
