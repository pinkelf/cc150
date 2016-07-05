package com.example.pack201to300;

import com.example.TreeNode;

/**
 * Created by majie on 16/7/5.
 */
public class CountCompleteTreeNodes {

    /**
     * Given a complete binary tree, count the number of nodes.
     * <p/>
     * Definition of a complete binary tree from Wikipedia:
     * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
     *
     * @param root
     * @return
     */
    public static int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ll = getLeft(root.left);
        int lr = getRight(root.left);
        int rl = getLeft(root.right);
        int rr = getRight(root.right);

        if (ll == rr) {
            return (1 << (ll + 1)) - 1;
        } else if (ll > lr) {
            return countNodes(root.left) + (1 << rr);
        } else if (rl > rr) {
            return countNodes(root.right) + (1 << ll);
        } else {
            return (1 << rr) + (1 << ll) - 1;
        }
    }

    private static int getLeft(TreeNode root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.left;
        }
        return h;
    }

    private static int getRight(TreeNode root) {
        int h = 0;
        while (root != null) {
            h++;
            root = root.right;
        }
        return h;
    }
}
