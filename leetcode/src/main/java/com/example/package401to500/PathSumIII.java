package com.example.package401to500;

import com.example.TreeNode;

/**
 * Created by majie on 16/12/2.
 */

public class PathSumIII {
    /**
     * You are given a binary tree in which each node contains an integer value.
     * <p>
     * Find the number of paths that sum to a given value.
     * <p>
     * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
     * <p>
     * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
     * <p>
     * Example:
     * <p>
     * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
     * <p>
     * 10
     * /  \
     * 5   -3
     * / \    \
     * 3   2   11
     * / \   \
     * 3  -2   1
     * <p>
     * Return 3. The paths that sum to 8 are:
     * <p>
     * 1.  5 -> 3
     * 2.  5 -> 2 -> 1
     * 3. -3 -> 11
     *
     * @param root
     * @param sum
     * @return
     */
    public static int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return path(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private static int path(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val == sum) {
            count++;
        }
        if (node.left != null) {
            count += path(node.left, sum - node.val);
        }
        if (node.right != null) {
            count += path(node.right, sum - node.val);
        }
        return count;
    }
}
