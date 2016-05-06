package com.example.pack101to200;

import com.example.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by majie on 16/2/2.
 */
public class BinaryTreeLevelOrderTraversal2 {
    /**
     * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
     * <p>
     * For example:
     * Given binary tree {3,9,20,#,#,15,7},
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its bottom-up level order traversal as:
     * [
     * [15,7],
     * [9,20],
     * [3]
     * ]
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        if (root == null) {
            return result;
        }

        list.add(root);
        result.add(convert(list));
        getList(0, list, result);
        return result;
    }

    private static void getList(int level, LinkedList<TreeNode> list, List<List<Integer>> result) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinkedList<TreeNode> treelist = new LinkedList<TreeNode>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).left != null) {
                treelist.add(list.get(i).left);
            }
            if (list.get(i).right != null) {
                treelist.add(list.get(i).right);
            }
        }
        if (!treelist.isEmpty()) {
            //the only difference from the normal level traversal. tricky way.
            result.add(0, convert(treelist));
        }
        getList(level + 1, treelist, result);
    }

    private static ArrayList<Integer> convert(LinkedList<TreeNode> list) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).val);
        }
        return result;
    }
}
