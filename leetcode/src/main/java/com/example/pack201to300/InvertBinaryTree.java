package com.example.pack201to300;

import com.example.TreeNode;

/**
 * Created by majie on 16/5/9.
 */
public class InvertBinaryTree {
    /**
     * Invert a binary tree.
     * <p/>
     * 4
     * /   \
     * 2     7
     * / \   / \
     * 1   3 6   9
     * to
     * 4
     * /   \
     * 7     2
     * / \   / \
     * 9   6 3   1
     *
     * @param root
     * @return
     */
    public static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private static void invert(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
}
