package leetcode.java.problems.problem0239;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Ques: https://leetcode.com/problems/sliding-window-maximum/
 * Tags: #sliding_window
 * Complexity: Time: O(n), Space: O(n)
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        LinkedList<Integer> doublyLinkedList = new LinkedList();
        int right = 0;
        while (right < k) {
            if (addElement(doublyLinkedList, nums, right)) {
                right++;
            }
        }
        ans.add(nums[doublyLinkedList.getFirst()]);
        while (right < nums.length) {
            if (doublyLinkedList.size() > 0 && right - doublyLinkedList.getFirst() == k) {
                doublyLinkedList.removeFirst();
            }
            if (addElement(doublyLinkedList, nums, right)) {
                right++;
                ans.add(nums[doublyLinkedList.getFirst()]);
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    private boolean addElement(LinkedList<Integer> doublyLinkedList, int[] nums, int right) {
        if (doublyLinkedList.isEmpty() || nums[doublyLinkedList.getLast()] > nums[right]) {
            doublyLinkedList.addLast(right);
            return true;
        }
        doublyLinkedList.removeLast();
        return false;
    }
}
