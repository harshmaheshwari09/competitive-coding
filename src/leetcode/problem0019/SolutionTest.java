package leetcode.problem0019;

import org.junit.jupiter.api.Test;
import resources.ListNode;

import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        ListNode actual = sol.removeNthFromEnd(ListNode.getList(List.of(1, 2, 3, 4, 5)), 2);
        ListNode expected = ListNode.getList(List.of(1, 2, 3, 5));
        ListNode.validate(expected, actual);
    }

    @Test
    public void testSolution2() {
        Solution sol = new Solution();
        ListNode actual = sol.removeNthFromEnd(ListNode.getList(List.of(1)), 1);
        ListNode expected = ListNode.getList(List.of());
        ListNode.validate(expected, actual);
    }

    @Test
    public void testSolution3() {
        Solution sol = new Solution();
        ListNode actual = sol.removeNthFromEnd(ListNode.getList(List.of(1, 2)), 1);
        ListNode expected = ListNode.getList(List.of(1));
        ListNode.validate(expected, actual);
    }
}
