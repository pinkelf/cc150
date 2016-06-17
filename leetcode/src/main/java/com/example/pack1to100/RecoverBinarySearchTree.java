package com.example.pack1to100;

import com.example.TreeNode;

import java.util.ArrayList;

/**
 * Created by majie on 16/6/17.
 */
public class RecoverBinarySearchTree {
    /**
     * Two elements of a binary search tree (BST) are swapped by mistake.
     * <p/>
     * Recover the tree without changing its structure.
     */
    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void recoverTree(TreeNode root) {

        inOrder(root);

        int left = 0;
        int right = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                left = list.get(i);
                break;
            }
        }
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) < list.get(i - 1)) {
                right = list.get(i);
                break;
            }
        }

        swap(root, left, right);
    }

    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    private static void swap(TreeNode root, int left, int right) {
        if (root == null) {
            return;
        }
        if (root.val == left) {
            root.val = right;
        } else if (root.val == right) {
            root.val = left;
        }
        swap(root.left, left, right);
        swap(root.right, left, right);
    }
}
