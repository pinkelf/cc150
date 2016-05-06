package com.example.pack1to100;

import com.example.ListNode;

/**
 * Created by majie on 16/1/14.
 */
public class PartitionList {
    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre1 = start;
        ListNode pre2 = start;
        ListNode index1 = head;
        ListNode index2 = head;

        while (index1 != null && index1.val < x) {
            pre1 = pre1.next;
            index1 = index1.next;
        }
        if (index1 != null && index1.next != null) {
            index2 = index1;
            pre2 = pre1;
            while (index2 != null) {
                if (index2.val < x) {
                    insertToFront(pre1, index1, pre2, index2);
                    pre1 = index2;
                    index2 = pre2.next;
                } else {
                    pre2 = index2;
                    index2 = index2.next;
                }
            }
        }
        return start.next;

    }

    private static void insertToFront(ListNode pre1, ListNode index1, ListNode pre2, ListNode index2) {
        pre2.next = index2.next;
        pre1.next = index2;
        index2.next = index1;
    }
}
