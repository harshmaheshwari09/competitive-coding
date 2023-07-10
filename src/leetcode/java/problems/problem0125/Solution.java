package leetcode.java.problems.problem0125;

/**
 * Ques: https://leetcode.com/problems/valid-palindrome/
 * Tags: #string, #array
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
