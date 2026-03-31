package leetcode.java.problems.problem0287;

/**
 * Link: <a href="https://leetcode.com/problems/find-the-duplicate-number/">LeetCode</a>
 * Tags: #array #two-pointers #linked-list
 * Complexity: Time: O(n), Space: O(1)
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while (fast != slow);

        slow = 0;
        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return fast;
    }
}
