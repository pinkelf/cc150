package com.example.pack301to400;

import com.example.TreeNode;

/**
 * Created by majie on 16/12/7.
 */

public class HouseRobberIII {

    /**
     * The thief has found himself a new place for his thievery again. There is only one entrance to this area, called the "root."
     * Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that "all houses in this place forms a binary tree".
     * It will automatically contact the police if two directly-linked houses were broken into on the same night.
     * <p>
     * Determine the maximum amount of money the thief can rob tonight without alerting the police.
     * <p>
     * Example 1:
     * 3
     * / \
     * 2   3
     * \   \
     * 3   1
     * Maximum amount of money the thief can rob = 3 + 3 + 1 = 7.
     *
     * @param root
     * @return
     */
    public static int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }
        int left = 0;
        if (root.left != null) {
            left = rob(root.left.left) + rob(root.left.right);
        }
        int right = 0;
        if (root.right != null) {
            right = rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(root.val + left + right, rob(root.left) + rob(root.right));
    }
}
