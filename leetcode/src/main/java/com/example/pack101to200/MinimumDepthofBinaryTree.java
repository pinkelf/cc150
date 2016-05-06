package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/2/2.
 */
public class MinimumDepthofBinaryTree {

    /**
     * Given a binary tree, find its minimum depth.
     * <p>
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     *
     * @param root
     * @return
     */
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        //don't do if(left ==1 || right ==1) return 1. We need "from the root node down to the nearest leaf node."
        //check whether root is a leaf
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.left == null) {
            return minDepth(root.right) + 1;
        } else if (root.right == null) {
            return minDepth(root.left) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
