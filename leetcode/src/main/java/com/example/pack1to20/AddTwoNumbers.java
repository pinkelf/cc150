package com.example.pack1to20;

/**
 * Created by majie on 15/12/15.
 */
public class AddTwoNumbers {

    /**
     * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
     * <p>
     * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
     * Output: 7 -> 0 -> 8
     */

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0);
        ListNode index = list;
        boolean addOne = false;
        while (l1 != null || l2 != null || addOne) {
            int sum = ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0);
            if (addOne) {
                sum++;
            }
            addOne = sum > 9 ? true : false;
            index.next = new ListNode(sum % 10);
            index = index.next;
            if (l1 != null) {
                l1 = l1.next;
            } else {
                l1 = null;
            }
            if (l2 != null) {
                l2 = l2.next;
            } else {
                l2 = null;
            }
        }
        return list.next;
    }
}
