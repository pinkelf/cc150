package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/2/25.
 */
public class ReorderList {
    public static void reorderList(ListNode head) {
        while (head == null || head.next == null) {
            return;
        }

        //get count
        int count = 1;
        ListNode end = head;
        while (end.next != null) {
            count++;
            end = end.next;
        }

        //find mid
        ListNode head1 = head;
        for (int i = 0; i < (count + 1) / 2 - 1; i++) {
            head1 = head1.next;
        }

        ListNode head2 = head1.next;
        head1.next = null;

        //reverse
        while (head2 != end) {
            ListNode node = head2.next;

            head2.next = end.next;
            end.next = head2;

            head2 = node;
        }

        //combine
        ListNode node1 = head;
        ListNode node2 = end;
        while (node2 != null) {
            ListNode node3 = node1.next;
            ListNode node4 = node2.next;

            node2.next = node1.next;
            node1.next = node2;

            node1 = node3;
            node2 = node4;
        }
    }
}
