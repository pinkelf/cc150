package com.example.pack1to100;

import com.example.*;

/**
 * Created by majie on 16/1/28.
 */
public class SameTree {

    /**
     * Given two binary trees, write a function to check if they are equal or not.
     * <p/>
     * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
     *
     * @param p
     * @param q
     * @return
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
