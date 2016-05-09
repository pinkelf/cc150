package com.example.pack301to400;

import com.example.ListNode;

/**
 * Created by majie on 16/5/9.
 */
public class OddEvenLinkedList {

    /**
     * Given a singly linked list, group all odd nodes together followed by the even nodes. Please note here we are talking about the node number and not the value in the nodes.
     * <p/>
     * You should try to do it in place. The program should run in O(1) space complexity and O(nodes) time complexity.
     * <p/>
     * Example:
     * Given 1->2->3->4->5->NULL,
     * return 1->3->5->2->4->NULL.
     * <p/>
     * Note:
     * The relative order inside both the even and odd groups should remain as it was in the input.
     * The first node is considered odd, the second node even and so on ...
     *
     * @param head
     * @return
     */
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode even = new ListNode(0);
        ListNode evenIndex = even;
        ListNode index = head;
        ListNode pre = null;
        boolean isFake = false;
        while (index != null && index.next != null) {
            ListNode node = index.next;
            index.next = node.next;
            if (node.next == null) {
                pre = index;
            }
            evenIndex.next = node;
            evenIndex = evenIndex.next;
            evenIndex.next = null;
            index = index.next;
        }

        if (pre != null) {
            pre.next = even.next;
        } else {
            index.next = even.next;
        }

        return head;
    }
}
