package leetcode.java.problems.problem0088;

/**
 * Link: <a href="https://leetcode.com/problems/merge-sorted-array/description/">LeetCode</a>
 * Tags: #array #two-pointers #sorting
 * Complexity: Time: O(m + n), Space: O(1)
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m--;
        n--;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[k--] = nums1[m--];
            } else {
                nums1[k--] = nums2[n--];
            }
        }

        while (n >= 0) {
            nums1[k--] = nums2[n--];
        }
    }
}
