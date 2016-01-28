package com.example.pack101to150;

import com.example.*;

/**
 * Created by majie on 16/1/28.
 */
public class SymmetricTree {

    /**
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     * <p/>
     * For example, this binary tree is symmetric:
     * <p/>
     * 1
     * / \
     * 2   2
     * / \ / \
     * 3  4 4  3
     * But the following is not:
     * 1
     * / \
     * 2   2
     * \   \
     * 3    3
     *
     * @param root
     * @return
     */
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode newRoot = new TreeNode(root.val);
        switchCopy(root, newRoot);
        return isSameTree(root, newRoot);
    }

    private static void switchCopy(TreeNode root, TreeNode newRoot) {
        if (root.left != null) {
            newRoot.right = new TreeNode(root.left.val);
        }
        if (root.right != null) {
            newRoot.left = new TreeNode(root.right.val);
        }
        if (root.left != null) {
            switchCopy(root.left, newRoot.right);
        }
        if (root.right != null) {
            switchCopy(root.right, newRoot.left);
        }
    }

    private static boolean isSameTree(TreeNode root, TreeNode newRoot) {
        if (root == null && newRoot == null) {
            return true;
        } else if (root == null || newRoot == null) {
            return false;
        } else if (root.val != newRoot.val) {
            return false;
        } else {
            if (isSameTree(root.left, newRoot.left)) {
                return isSameTree(root.right, newRoot.right);
            } else {
                return false;
            }
        }
    }
}
