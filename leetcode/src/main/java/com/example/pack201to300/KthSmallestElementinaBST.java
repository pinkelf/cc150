package com.example.pack201to300;

import com.example.TreeNode;

/**
 * Created by majie on 16/5/24.
 */
public class KthSmallestElementinaBST {

    public static int val = 0;
    public static int count =0;

    /**
     * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
     * <p/>
     * Note:
     * You may assume k is always valid, 1 ≤ k ≤ BST's total elements.
     * <p/>
     * Follow up:
     * What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
     *
     * @param root
     * @param k
     * @return
     */
    public static int kthSmallest(TreeNode root, int k) {
        InOrder(root, k);
        return val;
    }

    private static void InOrder(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        InOrder(root.left, k);

        count++;
        if (count == k) {
            val = root.val;
            return;
        }

        InOrder(root.right, k);
    }
}
