package com.example.pack1to100;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by majie on 16/5/27.
 */
public class ValidateBinarySearchTree {

    /**
     * Given a binary tree, determine if it is a valid binary search tree (BST).
     * <p/>
     * Assume a BST is defined as follows:
     * <p/>
     * The left subtree of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     *
     * @param root
     * @return
     */
    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return inOrder(root, new Stack<Integer>());
    }

    //break the whole recursion if any branch return false
    private static boolean inOrder(TreeNode root, Stack<Integer> stack) {
        if (root.left != null) {
            if (!inOrder(root.left, stack)) {
                return false;
            }
        }
        if (!stack.isEmpty() && root.val <= stack.peek()) {
            return false;
        } else {
            stack.push(root.val);
        }
        if (root.right != null) {
            if (!inOrder(root.right, stack)) {
                return false;
            }
        }
        return true;
    }
}
