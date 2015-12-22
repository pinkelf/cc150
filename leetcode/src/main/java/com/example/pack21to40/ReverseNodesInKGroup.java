package com.example.pack21to40;

import com.example.ListNode;

/**
 * Created by majie on 15/12/21.
 */
public class ReverseNodesInKGroup {
    /**
     * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
     * <p/>
     * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
     * <p/>
     * You may not alter the values in the nodes, only nodes itself may be changed.
     * <p/>
     * Only constant memory is allowed.
     * <p/>
     * For example,
     * Given this linked list: 1->2->3->4->5
     * <p/>
     * For k = 2, you should return: 2->1->4->3->5
     * <p/>
     * For k = 3, you should return: 3->2->1->4->5
     *
     * @param head
     * @param k
     * @return
     */
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
