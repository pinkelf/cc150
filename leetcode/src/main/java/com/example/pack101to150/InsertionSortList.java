package com.example.pack101to150;

import com.example.*;

/**
 * Created by majie on 16/2/29.
 */
public class InsertionSortList {
    /**
     * Sort a linked list using insertion sort.
     *
     * @param head
     * @return
     */
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = new ListNode(Integer.MIN_VALUE);
        start.next = head;
        ListNode index = head;

        while (index != null && index.next != null) {
            ListNode insert = start;
            ListNode cur = index.next;
            while (insert != index && insert.next.val < cur.val) {
                insert = insert.next;
            }
            if (insert != index) {
                ListNode node = cur.next;
                cur.next = insert.next;
                insert.next = cur;
                index.next = node;
            } else {
                index = index.next;
            }
        }

        return start.next;
    }
}
