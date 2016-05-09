package com.example.pack201to300;

import com.example.ListNode;

/**
 * Created by majie on 16/5/9.
 */
public class DeleteNodeinaLinkedList {

    /**
     * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
     * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
     *
     * @param node
     */
    public static void deleteNode(ListNode node) {
        if (node.next == null) {
            node = null;
            return;
        }
        int temp = node.next.val;
        node.next = node.next.next;
        node.val = temp;
    }
}
