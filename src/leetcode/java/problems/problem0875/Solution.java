package leetcode.java.problems.problem0875;

/**
 * Ques: https://leetcode.com/problems/koko-eating-bananas/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int right = 1, left = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEat(mid, piles, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canEat(int bananaPerHour, int piles[], int givenHours) {
        int hourSpend = 0;
        for (int bananas : piles) {
            hourSpend += Math.ceil(bananas * 1.0 / bananaPerHour);
        }
        return hourSpend <= givenHours;
    }
}
