package com.example.pack1to100;

import com.example.ListNode;

/**
 * Created by majie on 16/5/6.
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     * <p/>
     * For example,
     * Given 1->1->2, return 1->2.
     * Given 1->1->2->3->3, return 1->2->3.
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node1 = head;
        ListNode node2 = head.next;
        while (node1 != null && node2 != null) {
            if (node1.val == node2.val) {
                node2 = node2.next;
                node1.next = node2;
            } else {
                node1 = node2;
                node2 = node2.next;
            }
        }
        return head;
    }
}
