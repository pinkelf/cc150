package com.example.pack101to150;

import com.example.TreeNode;

/**
 * Created by Administrator on 2016/4/16.
 */
public class BinaryTreeMaximumPathSum {
    private static int max = 0;

    /**
     * Given a binary tree, find the maximum path sum.
     * <p/>
     * For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path does not need to go through the root.
     * <p/>
     * For example:
     * Given the below binary tree,
     * <p/>
     * 1
     * / \
     * 2   3
     * Return 6.
     *
     * @param root
     * @return
     */
    public static int maxPathSum(TreeNode root) {
        getMax(root);
        return max;
    }

    private static int getMax(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, getMax(node.left));
        int right = Math.max(0, getMax(node.right));
        max = Math.max(max, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
