package com.example.pack101to150;

import com.example.*;

/**
 * Created by majie on 16/2/15.
 */
public class ConvertSortedListtoBinarySearchTree {

    /**
     * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
     *
     * @param head
     * @return
     */
    public static TreeNode sortedListToBST(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            size++;
        }
        return getTree(head, size);
    }

    private static TreeNode getTree(ListNode head, int size) {
        if (size == 0 || head == null) {
            return null;
        }
        if (size == 1) {
            return new TreeNode(head.val);
        }
        int index = 0;
        ListNode node = head;
        while (index < (size - 1) / 2) {
            node = node.next;
            index++;
        }

        TreeNode root = new TreeNode(node.val);
        root.left = getTree(head, index);
        root.right = getTree(node.next, size - index - 1);

        return root;
    }
}
