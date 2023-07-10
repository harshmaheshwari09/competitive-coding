package leetcode.java.problems.problem0680;

/**
 * Ques: https://leetcode.com/problems/valid-palindrome-ii/
 * Tags: #array
 * Complexity: Time: O(n), Space: O(1)
 */
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return isPallindrome(s, left, right - 1) || isPallindrome(s, left + 1, right);
            }
        }
        return true;
    }

    private boolean isPallindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}