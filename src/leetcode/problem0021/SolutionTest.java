package leetcode.problem0021;

import org.junit.jupiter.api.Test;
import resources.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        ListNode list1 = ListNode.getList(List.of(1, 2, 4));
        ListNode list2 = ListNode.getList(List.of(1, 3, 4));
        ListNode expected = ListNode.getList(List.of(1, 1, 2, 3, 4, 4));
        Solution sol = new Solution();
        ListNode.validate(expected, sol.mergeTwoLists(list1, list2));
    }

    @Test
    public void testSolution2() {
        ListNode list1 = ListNode.getList(new ArrayList<>());
        ListNode list2 = ListNode.getList(new ArrayList<>());
        ListNode expected = ListNode.getList(new ArrayList<>());
        Solution sol = new Solution();
        ListNode.validate(expected, sol.mergeTwoLists(list1, list2));
    }

    @Test
    public void testSolution3() {
        ListNode list1 = ListNode.getList(new ArrayList<>());
        ListNode list2 = ListNode.getList(List.of(1, 3, 4));
        ListNode expected = ListNode.getList(List.of(1, 3, 4));
        Solution sol = new Solution();
        ListNode.validate(expected, sol.mergeTwoLists(list1, list2));
    }
}