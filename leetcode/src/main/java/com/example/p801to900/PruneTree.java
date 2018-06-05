package com.example.p801to900;

import com.example.TreeNode;

public class PruneTree {

    public static TreeNode pruneTree(TreeNode root) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(0);
        node.right.right = new TreeNode(1);
        node.right.left = new TreeNode(0);
        onlyZero(node);
        return node;
    }

    public static boolean onlyZero(TreeNode node) {
        if (node == null) {
            return true;
        }
        boolean left = onlyZero(node.left);
        boolean right = onlyZero(node.right);
        if (node.val == 0) {
            if (left && right) {
                node.val = -1;
                return true;
            }
        }
        return false;
    }
}
