package leetcode.java.problems.problem0904;

import java.util.HashMap;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/fruit-into-baskets/
 * Tags: #sliding_window
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxFruits = 0;
        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.getOrDefault(fruits[left], 0) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }
}
