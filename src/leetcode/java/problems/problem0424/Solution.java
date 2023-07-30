package leetcode.java.problems.problem0424;

/**
 * Ques: https://leetcode.com/problems/longest-repeating-character-replacement/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        int left = 0;
        int max = 0;
        int[] freq = new int[26];
        for (int right = 0; right < s.length(); right++) {
            int currChar = s.charAt(right) - 'A';
            freq[currChar]++;
            max = Math.max(max, freq[currChar]);
            if (right - left + 1 - max > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
