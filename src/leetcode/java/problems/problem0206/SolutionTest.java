package leetcode.java.problems.problem0206;

import org.junit.jupiter.api.Test;
import leetcode.java.model.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseList(ListNode.getLinkedList(List.of(1, 2, 3, 4, 5)));
        ListNode expected = ListNode.getLinkedList(List.of(5, 4, 3, 2, 1));
        ListNode.validate(expected, actual);
    }

    @Test
    public void testWithEmptyArray() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseList(ListNode.getLinkedList(new ArrayList<>()));
        ListNode expected = ListNode.getLinkedList(new ArrayList<>());
        ListNode.validate(expected, actual);
    }

    @Test
    public void testWithSingleElement() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseList(ListNode.getLinkedList(List.of(5)));
        ListNode expected = ListNode.getLinkedList(List.of(5));
        ListNode.validate(expected, actual);
    }
}
