package com.example.pack1to100;

import com.example.*;

/**
 * Created by majie on 16/1/6.
 */
public class RotateList {
    /**
     * Given a list, rotate the list to the right by k places, where k is non-negative.
     * <p/>
     * For example:
     * Given 1->2->3->4->5->NULL and k = 2,
     * return 4->5->1->2->3->NULL.
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode start = new ListNode(0);
        start.next = head;
        if (k == 0 || head == null) {
            return head;
        }
        ListNode index = start;
        ListNode indexM = start;
        int length;
        for (length = 0; index.next != null; length++) {
            index = index.next;
        }
        k = k % length;
        if (k == 0) {
            return start.next;
        }
        for (int i = 0; i < (length - k); i++) {
            indexM = indexM.next;
        }

        start.next = indexM.next;
        index.next = head;
        indexM.next = null;

        return start.next;
    }
}
