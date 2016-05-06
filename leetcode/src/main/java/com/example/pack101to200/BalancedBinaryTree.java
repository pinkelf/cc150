package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/2/2.
 */
public class BalancedBinaryTree {

    /**
     * Given a binary tree, determine if it is height-balanced.
     * <p>
     * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
     *
     * @param root
     * @return
     */
    public static boolean isBalanced(TreeNode root) {
        int depth = getDepth(root);
        return depth != -1;
    }

    private static int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = getDepth(root.left);
            int right = getDepth(root.right);
            //use -1 as not balanced.
            //any balance happens, return -1
            if (left == -1 || right == -1) {
                return -1;
            } else if (left - right > 1 || left - right < -1) {
                return -1;
            } else {
                return Math.max(left, right) + 1;
            }
        }
    }
}
