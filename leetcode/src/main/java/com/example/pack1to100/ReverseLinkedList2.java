package com.example.pack1to100;

import com.example.ListNode;

/**
 * Created by majie on 16/1/22.
 */
public class ReverseLinkedList2 {
    /**
     * Reverse a linked list from position m to n. Do it in-place and in one-pass.
     * <p>
     * For example:
     * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
     * <p>
     * return 1->4->3->2->5->NULL.
     * <p>
     * Note:
     * Given m, n satisfy the following condition:
     * 1 ≤ m ≤ n ≤ length of list.
     *
     * @param head
     * @param m
     * @param n
     * @return
     */
    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }
        ListNode begin = new ListNode(0);
        begin.next = head;
        ListNode pre = begin;
        ListNode over = begin;
        int index = 0;
        ListNode node = begin;
        while (node != null) {
            if (index == m - 1) {
                pre = node;
            }
            if (index == n) {
                over = node;
                break;
            }
            index++;
            node = node.next;
        }
        reverseList(pre, pre.next, over, over.next);
        return begin.next;
    }

    private static void reverseList(ListNode pre, ListNode start, ListNode end, ListNode over) {
        ListNode index = start;
        while (index != end) {
            ListNode temp = index.next;
            index.next = end.next;
            end.next = index;
            index = temp;
        }

        pre.next = end;
        start.next = over;
    }
}
