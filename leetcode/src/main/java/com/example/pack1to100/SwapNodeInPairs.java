package com.example.pack1to100;

import com.example.ListNode;

/**
 * Created by majie on 15/12/16.
 */
public class SwapNodeInPairs {
    /**
     * Given a linked list, swap every two adjacent nodes and return its head.
     * <p/>
     * For example,
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     * <p/>
     * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
     *
     * @param head
     * @return
     */

    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode index = pre;
        while (index.next != null && index.next.next != null) {
            swapNodes(index, index.next, index.next.next);
            index = index.next.next;
        }
        return pre.next;
    }

    private static void swapNodes(ListNode m, ListNode l, ListNode r) {
        m.next = r;
        l.next = r.next;
        r.next = l;
    }
}
