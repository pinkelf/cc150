package com.example.pack1to20;

/**
 * Created by majie on 15/12/16.
 */
public class RemoveNthNodeFromEndOfList {

    /**
     * Given a linked list, remove the nth node from the end of list and return its head.
     * <p>
     * For example,
     * <p>
     * Given linked list: 1->2->3->4->5, and n = 2.
     * <p>
     * After removing the second node from the end, the linked list becomes 1->2->3->5.
     * Note:
     * Given n will always be valid.
     * Try to do this in one pass.
     */

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        ListNode item = head;
        pre.next = item;
        ListNode index = item;

        while (n > 1) {
            index = index.next;
            n--;
        }
        while (index.next != null) {
            index = index.next;
            item = item.next;
            pre = pre.next;
        }

        if (pre.next == head) {
            return item.next;
        } else {
            pre.next = item.next;
            return head;
        }
    }
}
