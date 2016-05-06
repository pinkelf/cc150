package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/2/22.
 */
public class LinkedListCycle2 {
    /**
     * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
     * <p>
     * Note: Do not modify the linked list.
     *
     * @param head
     * @return
     */
    // we can use set or footprint to make it straight forward.
    public static ListNode detectCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        if (head == null) {
            return null;
        }
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                break;
            }
        }
        if (p2 == null || p2.next == null) {
            return null;
        }

        //假设A为head到环开始的长度。之后又走了B的长度
        //那么p1,p2相遇时，p1走了A+B的长度，p2走了A+B+X的长度。假设环的长度为C,那么X＝n*C
        //又因为p2走了2(A+B)的长度，所以X=A+B.
        //所以A=n*C-B.所以此时从头再次走A的长度，环内的点本来就在B的位置，又走了n*C-B的长度。
        //于是就相遇在环的起点...
        ListNode p3 = head;
        while (p3 != p1) {
            p3 = p3.next;
            p1 = p1.next;
        }

        return p3;
    }

}
