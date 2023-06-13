package Leetcode_0206;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getList(List<Integer> integers) {
        ListNode head = new ListNode();
        ListNode curr = head;
        for (int val : integers) {
            ListNode node = new ListNode(val);
            curr.next = node;
            curr = curr.next;
        }
        return head.next;
    }
}
