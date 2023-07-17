package leetcode.java.problems.problem0846;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Ques: https://leetcode.com/problems/hand-of-straights/
 * Tags: #greedy
 * Complexity: Time: O(nlog(n)), Space: O(n)
 */
public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int val : hand) {
            countMap.put(val, countMap.getOrDefault(val, 0) + 1);
        }

        Arrays.sort(hand);
        for (int card : hand) {
            if (countMap.get(card) == 0) {
                continue;
            }
            for (int i = 0; i < groupSize; i++) {
                int curr = card + i;
                if (countMap.getOrDefault(curr, 0) == 0) {
                    return false;
                }
                countMap.put(curr, countMap.get(curr) - 1);
            }
        }
        return true;
    }
}
