package com.example.pack21to40;

import com.example.ListNode;

/**
 * Created by majie on 15/12/16.
 */
public class SwapNodeInPairs {

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
