package leetcode.java.problems.problem1704;

/**
 * Ques: https://leetcode.com/problems/determine-if-string-halves-are-alike
 * Tags: #string
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        int vowels = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (isVowel(s.charAt(i))) {
                vowels++;
            }
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowels--;
            }
        }

        return vowels == 0;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
