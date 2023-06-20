package leetcode.java.problems.problem0237;

import org.junit.jupiter.api.Test;
import leetcode.java.model.ListNode;

import java.util.List;

public class SolutionTest {
    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        ListNode actual = ListNode.getLinkedList(List.of(4, 5, 1, 9));
        ListNode expected = ListNode.getLinkedList(List.of(4, 1, 9));
        sol.deleteNode(actual.next);
        ListNode.validate(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        ListNode actual = ListNode.getLinkedList(List.of(4, 5, 1, 9));
        ListNode expected = ListNode.getLinkedList(List.of(4, 5, 9));
        sol.deleteNode(actual.next.next);
        ListNode.validate(expected, actual);
    }
}
