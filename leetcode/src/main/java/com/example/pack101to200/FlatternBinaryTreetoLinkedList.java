package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/2/15.
 */
public class FlatternBinaryTreetoLinkedList {

    /**
     * Given a binary tree, flatten it to a linked list in-place.
     * <p>
     * For example,
     * Given
     * <p>
     * 1
     * / \
     * 2   5
     * / \   \
     * 3   4   6
     * The flattened tree should look like:
     * 1
     * \
     * 2
     * \
     * 3
     * \
     * 4
     * \
     * 5
     * \
     * 6
     *
     * @param root
     */
    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        getList(root);
    }

    private static TreeNode getList(TreeNode root) {
        if (root.left == null && root.right == null) {
        } else if (root.right == null) {
            root.right = getList(root.left);
            root.left = null;
        } else if (root.left == null) {
            root.right = getList(root.right);
            root.left = null;
        } else {
            TreeNode right = root.right;
            root.right = getList(root.left);
            root.left = null;
            TreeNode index = root;
            while (index.right != null) {
                index = index.right;
            }
            index.right = getList(right);
        }
        return root;
    }
}
