package Leetcode_0003;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0, right = 0;
        Map<Character, Integer> visitedMap = new HashMap<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (visitedMap.containsKey(c)) {
                left = Math.max(left, visitedMap.get(c) + 1);
            }
            visitedMap.put(c, right);
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
