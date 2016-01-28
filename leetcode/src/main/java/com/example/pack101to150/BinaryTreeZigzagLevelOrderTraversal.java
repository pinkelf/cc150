package com.example.pack101to150;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by majie on 16/1/28.
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    /**
     * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
     * <p/>
     * For example:
     * Given binary tree {3,9,20,#,#,15,7},
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its zigzag level order traversal as:
     * [
     * [3],
     * [20,9],
     * [15,7]
     * ]
     *
     * @param root
     * @return
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        addOneLevel(queue, result, 0);
        return result;
    }


    public void addOneLevel(LinkedList<TreeNode> queue, List<List<Integer>> result, int level) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> newQ = new LinkedList<TreeNode>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val != Integer.MAX_VALUE) {
                if (level % 2 == 1) {
                    list.add(0, node.val);
                } else {
                    list.add(node.val);
                }
            }
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
