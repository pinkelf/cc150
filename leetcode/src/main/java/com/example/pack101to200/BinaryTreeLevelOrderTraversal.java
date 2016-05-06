package com.example.pack101to200;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by majie on 16/1/28.
 */
public class BinaryTreeLevelOrderTraversal {

    /**
     * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     * <p/>
     * For example:
     * Given binary tree {3,9,20,#,#,15,7},
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its level order traversal as:
     * [
     * [3],
     * [9,20],
     * [15,7]
     * ]
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        //Linked list is used as queue
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        addOneLevel(queue, result, 0);
        return result;
    }

    private static void addOneLevel(LinkedList<TreeNode> queue, List<List<Integer>> result, int level) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> newQ = new LinkedList<TreeNode>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);

            if (node.left != null) {
                newQ.add(node.left);
            }
            if (node.right != null) {
                newQ.add(node.right);
            }
        }
        result.add(list);
        if (newQ.isEmpty()) {
            return;
        } else {
            addOneLevel(newQ, result, level + 1);
        }
    }
}
