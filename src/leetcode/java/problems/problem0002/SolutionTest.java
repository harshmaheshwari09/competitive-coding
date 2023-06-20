package leetcode.java.problems.problem0002;

import org.junit.jupiter.api.Test;
import leetcode.java.model.ListNode;

import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        ListNode l1 = ListNode.getLinkedList(List.of(2, 4, 3));
        ListNode l2 = ListNode.getLinkedList(List.of(5, 6, 4));
        Solution sol = new Solution();
        ListNode actual = sol.addTwoNumbers(l1, l2);
        ListNode expected = ListNode.getLinkedList(List.of(7, 0, 8));
        ListNode.validate(expected, actual);
    }

    @Test
    public void testSolution2() {
        ListNode l1 = ListNode.getLinkedList(List.of(0));
        ListNode l2 = ListNode.getLinkedList(List.of(0));
        Solution sol = new Solution();
        ListNode actual = sol.addTwoNumbers(l1, l2);
        ListNode expected = ListNode.getLinkedList(List.of(0));
        ListNode.validate(expected, actual);
    }

    @Test
    public void testSolution3() {
        ListNode l1 = ListNode.getLinkedList(List.of(9, 9, 9, 9, 9, 9, 9));
        ListNode l2 = ListNode.getLinkedList(List.of(9, 9, 9, 9));
        Solution sol = new Solution();
        ListNode actual = sol.addTwoNumbers(l1, l2);
        ListNode expected = ListNode.getLinkedList(List.of(8, 9, 9, 9, 0, 0, 0, 1));
        ListNode.validate(expected, actual);
    }
}
