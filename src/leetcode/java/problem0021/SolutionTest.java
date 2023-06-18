package leetcode.java.problem0021;

import org.junit.jupiter.api.Test;
import leetcode.java.resources.ListNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void testSolution1() {
        ListNode list1 = ListNode.getLinkedList(List.of(1, 2, 4));
        ListNode list2 = ListNode.getLinkedList(List.of(1, 3, 4));
        ListNode expected = ListNode.getLinkedList(List.of(1, 1, 2, 3, 4, 4));
        Solution sol = new Solution();
        ListNode.validate(expected, sol.mergeTwoLists(list1, list2));
    }

    @Test
    public void testSolution2() {
        ListNode list1 = ListNode.getLinkedList(new ArrayList<>());
        ListNode list2 = ListNode.getLinkedList(new ArrayList<>());
        ListNode expected = ListNode.getLinkedList(new ArrayList<>());
        Solution sol = new Solution();
        ListNode.validate(expected, sol.mergeTwoLists(list1, list2));
    }

    @Test
    public void testSolution3() {
        ListNode list1 = ListNode.getLinkedList(new ArrayList<>());
        ListNode list2 = ListNode.getLinkedList(List.of(1, 3, 4));
        ListNode expected = ListNode.getLinkedList(List.of(1, 3, 4));
        Solution sol = new Solution();
        ListNode.validate(expected, sol.mergeTwoLists(list1, list2));
    }
}
