package leetcode.java.problems.problem0049;

import java.util.*;

/**
 * Ques: https://leetcode.com/problems/group-anagrams/
 * Tags: #array
 * Complexity: Time: O(n * klog(k)), Space: O(n * k)
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (var str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedStr = new String(arr);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
