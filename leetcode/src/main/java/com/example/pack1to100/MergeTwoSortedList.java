package com.example.pack1to100;

import com.example.ListNode;

/**
 * Created by majie on 15/12/16.
 */
public class MergeTwoSortedList {
    /**
     * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
     *
     * @param l1
     * @param l2
     * @return
     */

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode index = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                index.next = new ListNode(l1.val);
                l1 = l1.next;
                index = index.next;
            } else {
                index.next = new ListNode(l2.val);
                l2 = l2.next;
                index = index.next;
            }
        }
        if (l1 == null) {
            index.next = l2;
            return head.next;
        } else {
            index.next = l1;
            return head.next;
        }
    }
}
