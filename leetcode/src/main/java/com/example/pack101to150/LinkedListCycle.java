package com.example.pack101to150;

import com.example.*;

/**
 * Created by majie on 16/2/22.
 */
public class LinkedListCycle {

    /**
     * Given a linked list, determine if it has a cycle in it.
     * <p>
     * Follow up:
     * Can you solve it without using extra space?
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode index1 = head.next;
        ListNode index2 = head.next.next;
        while (index1 != null && index2 != null && index1 != index2) {
            index1 = index1.next;
            if (index2.next == null) {
                return false;
            }
            index2 = index2.next.next;
        }
        if (index2 == null) {
            return false;
        }
        return true;
    }
}
