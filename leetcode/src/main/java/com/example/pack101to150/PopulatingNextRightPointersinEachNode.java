package com.example.pack101to150;

import com.example.*;

/**
 * Created by majie on 16/2/26.
 */
public class PopulatingNextRightPointersinEachNode {
    public static void connect(TreeLinkNode root) {
        con(root, null);
    }

    private static void con(TreeLinkNode node1, TreeLinkNode node2) {
        if (node1 == null) {
            return;
        }
        node1.next = node2;
        con(node1.left, node1.right);
        if (node2 != null) {
            con(node1.right, node2.left);
        } else {
            con(node1.right, null);
        }
    }
}
