package com.example.pack201to300;

import com.example.ListNode;

/**
 * Created by majie on 16/5/9.
 */
public class RemoveLinkedListElements {
    /**
     * Remove all elements from a linked list of integers that have value val.
     * <p/>
     * Example
     * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
     * Return: 1 --> 2 --> 3 --> 4 --> 5
     *
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode index = start;
        while (index.next != null) {
            if (index.next.val == val) {
                index.next = index.next.next;
            } else {
                index = index.next;
            }
        }
        return start.next;
    }
}
