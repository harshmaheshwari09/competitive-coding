package leetcode.problem1318;

// https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
public class Solution {
    public int minFlips(int a, int b, int c) {
        int count = 0;
        while (a > 0 || b > 0 || c > 0) {
            if (c % 2 == 0) {
                count = count + (b % 2) + (a % 2);
            } else {
                count += ((a % 2 == 1 || b % 2 == 1) ? 0 : 1);
            }
            a /= 2;
            b /= 2;
            c /= 2;

        }
        return count;
    }
}
