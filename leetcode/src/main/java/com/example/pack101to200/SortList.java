package com.example.pack101to200;

import com.example.ListNode;

/**
 * Created by majie on 16/5/6.
 */
public class SortList {

    /**
     * Sort a linked list in O(n log n) time using constant space complexity.
     *
     * @param head
     * @return
     */
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode half = slow.next;
        slow.next = null;
        return merge(sortList(head), sortList(half));
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode index = node;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                index.next = list1;
                list1 = list1.next;
            } else {
                index.next = list2;
                list2 = list2.next;
            }
            index = index.next;
        }
        if (list1 != null) {
            index.next = list1;
        } else if (list2 != null) {
            index.next = list2;
        }

        return node.next;
    }
}
