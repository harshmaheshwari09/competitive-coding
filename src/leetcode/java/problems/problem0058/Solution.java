package leetcode.java.problems.problem0058;

/**
 * Ques: https://leetcode.com/problems/length-of-last-word/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
class Solution {
    public int lengthOfLastWord(String s) {
        var stringArray = s.trim().split("\\s+");
        return stringArray[stringArray.length - 1].length();
    }
}
