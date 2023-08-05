package leetcode.java.problems.problem0300;

/**
 * Ques: https://leetcode.com/problems/longest-increasing-subsequence/
 * Tags: #
 * Complexity: Time: O(), Space: O()
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        int len = 0;
        for (int val : nums) {
            int pos = binarySearch(lis, val, len);
            lis[pos] = val;
            if (pos == len) {
                len++;
            }
        }
        return len;
    }

    private int binarySearch(int[] lis, int val, int right) {
        int left = 0;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (lis[mid] < val) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
