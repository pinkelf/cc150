package com.example.pack151to200;

import com.example.*;

/**
 * Created by majie on 16/3/7.
 */
public class IntersectionofTwoLinkedLists {
    /**
     * Write a program to find the node at which the intersection of two singly linked lists begins.
     * <p/>
     * <p/>
     * For example, the following two linked lists:
     * <p/>
     * A:          a1 → a2
     * ↘
     * c1 → c2 → c3
     * ↗
     * B:     b1 → b2 → b3
     * begin to intersect at node c1.
     * <p/>
     * <p/>
     * Notes:
     * <p/>
     * If the two linked lists have no intersection at all, return null.
     * The linked lists must retain their original structure after the function returns.
     * You may assume there are no cycles anywhere in the entire linked structure.
     * Your code should preferably run in O(n) time and use only O(1) memory.
     *
     * @param headA
     * @param headB
     * @return
     */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        //link A & B
        ListNode node = headA;
        while (node.next != null) {
            node = node.next;
        }
        node.next = headB;

        ListNode node1 = headA;
        ListNode node2 = headA;

        //find circle
        while (node2 != null && node2.next != null) {
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2) {
                break;
            }
        }
        if (node2 == null || node2.next == null) {
            node.next = null;
            return null;
        }

        //find point
        ListNode node3 = headA;
        while (node3 != node1) {
            node1 = node1.next;
            node3 = node3.next;
        }

        node.next = null;
        return node3;
    }
}
