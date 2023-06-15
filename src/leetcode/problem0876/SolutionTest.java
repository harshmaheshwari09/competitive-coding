package leetcode.problem0876;

import org.junit.jupiter.api.Test;
import resources.ListNode;

import java.util.List;

public class SolutionTest {

    @Test
    public void testWithOddElements() {
        Solution sol = new Solution();
        ListNode actual = sol.middleNode(ListNode.getList(List.of(1, 2, 3, 4, 5)));
        ListNode expected = ListNode.getList(List.of(3, 4, 5));
        ListNode.validate(expected, actual);
    }

    @Test
    public void testWithEvenElements() {
        Solution sol = new Solution();
        ListNode actual = sol.middleNode(ListNode.getList(List.of(1, 2, 3, 4, 5, 6)));
        ListNode expected = ListNode.getList(List.of(4, 5, 6));
        ListNode.validate(expected, actual);
    }

    @Test
    public void testWithSingleElement() {
        Solution sol = new Solution();
        ListNode actual = sol.middleNode(ListNode.getList(List.of(1)));
        ListNode expected = ListNode.getList(List.of(1));
        ListNode.validate(expected, actual);
    }
}
