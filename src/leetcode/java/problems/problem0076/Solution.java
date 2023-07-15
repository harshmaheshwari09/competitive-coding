package leetcode.java.problems.problem0076;

import java.util.HashMap;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/minimum-window-substring/
 * Tags: #two_pointer
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int start = 0, matchedChars = 0, ansLeft = 0, ansRight = s.length() + 1;
        for (int end = 0; end < s.length(); end++) {
            char rightChar = s.charAt(end);
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                if (map.get(rightChar) == 0) {
                    matchedChars++;
                }
            }
            while (matchedChars == map.size()) {
                if (ansRight - ansLeft > end - start) {
                    ansRight = end;
                    ansLeft = start;
                }
                char leftChar = s.charAt(start++);
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) == 0) {
                        matchedChars--;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }
            }
        }

        return (ansRight - ansLeft + 1 > s.length() ? "" : s.substring(ansLeft, ansRight + 1));
    }
}
