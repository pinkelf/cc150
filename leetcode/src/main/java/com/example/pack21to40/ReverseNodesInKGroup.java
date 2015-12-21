package com.example.pack21to40;

import com.example.ListNode;

/**
 * Created by majie on 15/12/21.
 */
public class ReverseNodesInKGroup {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }

        int count = 1;
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode indexLeft = h;
        ListNode indexRight = head;

        while (indexRight != null) {
            if (count % k == 0) {
                indexLeft = reverseList(indexLeft, indexRight);
                indexRight = indexLeft.next;
                count = 0;
            } else {
                indexRight = indexRight.next;
            }
            count++;
        }
        return h.next;
    }

    private static ListNode reverseList(ListNode head, ListNode end) {
        ListNode result = head.next;
        ListNode index = head.next;
        head.next = end;
        while (index != end) {
            ListNode next = index.next;
            index.next = end.next;
            end.next = index;

            index = next;
        }
        return result;
    }

}
