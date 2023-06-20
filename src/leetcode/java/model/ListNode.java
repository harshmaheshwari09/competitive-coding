package leetcode.java.model;

import org.junit.jupiter.api.Assertions;

import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getLinkedList(List<Integer> integers) {
        ListNode head = new ListNode();
        ListNode curr = head;
        for (int val : integers) {
            ListNode node = new ListNode(val);
            curr.next = node;
            curr = curr.next;
        }
        return head.next;
    }

    public static void validate(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            Assertions.assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        Assertions.assertNull(expected);
        Assertions.assertNull(actual);
    }
}
