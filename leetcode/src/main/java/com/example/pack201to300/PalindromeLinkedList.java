package com.example.pack201to300;

import com.example.ListNode;

/**
 * Created by majie on 16/5/9.
 */
public class PalindromeLinkedList {

    /**
     * Given a singly linked list, determine if it is a palindrome.
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode half = head;
        ListNode tail = head.next.next;

        while (tail != null && tail.next != null) {
            tail = tail.next.next;
            half = half.next;
        }

        ListNode node = reverse(half.next);

        while (head != null && node != null) {
            if (head.val != node.val) {
                return false;
            }
            head = head.next;
            node = node.next;
        }
        if (head == null && node != null && node.next != null || (node == null && head != null && head.next != null)) {
            return false;
        }
        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        ListNode start = new ListNode(0);
        start.next = head;

        while (start.next != tail) {
            ListNode node = start.next;
            start.next = start.next.next;
            node.next = tail.next;
            tail.next = node;
        }

        return tail;
    }
}
