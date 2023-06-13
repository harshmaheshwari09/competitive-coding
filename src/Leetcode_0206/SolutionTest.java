package Leetcode_0206;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseList(ListNode.getList(List.of(1, 2, 3, 4, 5)));
        ListNode expected = ListNode.getList(List.of(5, 4, 3, 2, 1));
        validate(expected, actual);
    }

    @Test
    public void testWithEmptyArray() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseList(ListNode.getList(new ArrayList<>()));
        ListNode expected = ListNode.getList(new ArrayList<>());
        validate(expected, actual);
    }

    @Test
    public void testWithSingleElement() {
        Solution sol = new Solution();
        ListNode actual = sol.reverseList(ListNode.getList(List.of(5)));
        ListNode expected = ListNode.getList(List.of(5));
        validate(expected, actual);
    }

    public void validate(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assertions.assertNull(expected);
        Assertions.assertNull(actual);
    }
}
