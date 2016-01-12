package com.example.pack51to100;

import com.example.ListNode;

/**
 * Created by majie on 16/1/8.
 */
public class RemoveDuplicatesFromSortedList2 {

    /**
     * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
     * <p>
     * For example,
     * Given 1->2->3->3->4->4->5, return 1->2->5.
     * Given 1->1->1->2->3, return 2->3.
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = new ListNode(0);
        start.next = head;
        int mark = Integer.MAX_VALUE;
        ListNode index1 = start;
        ListNode index2 = head;
        while (index2 != null) {
            if (index2.val == mark) {
                index2 = index2.next;
                index1.next = index2;
            } else if (index2.next != null && index2.val == index2.next.val) {
                mark = index2.val;
                index2 = index2.next.next;
                index1.next = index2;
            } else if (index1.next == index2) {
                index1 = index2;
                index2 = index2.next;
            }
        }

        return start.next;
    }
}
