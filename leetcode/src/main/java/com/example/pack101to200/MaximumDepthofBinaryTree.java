package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/1/28.
 */
public class MaximumDepthofBinaryTree {

    /**
     * Given a binary tree, find its maximum depth.
     * <p/>
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */
    public static int maxDepth(TreeNode root) {
        return length(root);
    }

    private static int length(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(length(root.left), length(root.right)) + 1;
    }

}
