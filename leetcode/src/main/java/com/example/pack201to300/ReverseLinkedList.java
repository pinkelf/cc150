package com.example.pack201to300;

import com.example.ListNode;

/**
 * Created by majie on 16/5/9.
 */
public class ReverseLinkedList {

    /**
     * Reverse a singly linked list.
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        //find tail
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        //reverse list
        ListNode start = new ListNode(0);
        start.next = head;

        while (start.next != tail) {
            ListNode node = start.next;
            start.next = start.next.next;
            node.next = tail.next;
            tail.next = node;
        }

        return start.next;

    }
}
