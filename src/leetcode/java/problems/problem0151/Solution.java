package leetcode.java.problems.problem0151;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/reverse-words-in-a-string/
 * Tags: #string
 * Complexity: Time: O(n), Space: (n)
 */
public class Solution {
    public String reverseWords(String s) {
        List<String> wordList = new ArrayList<>();
        for (String curr : s.trim().split("\\s+")) {
            wordList.add(curr);
        }
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
