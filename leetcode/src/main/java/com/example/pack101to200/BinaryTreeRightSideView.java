package com.example.pack101to200;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/5/10.
 */
public class BinaryTreeRightSideView {

    /**
     * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
     * <p/>
     * For example:
     * Given the following binary tree,
     * 1            <---
     * /   \
     * 2     3         <---
     * \     \
     * 5     4       <---
     * You should return [1, 3, 4].
     *
     * @param root
     * @return
     */
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        ArrayList<TreeNode> list = new ArrayList<TreeNode>();
        if (root != null) {
            list.add(root);
        }
        levelTravel(list, result);
        return result;
    }

    private static void levelTravel(ArrayList<TreeNode> list, List<Integer> result) {
        if (list.isEmpty()) {
            return;
        }
        result.add(list.get(list.size() - 1).val);
        ArrayList<TreeNode> newList = new ArrayList<TreeNode>();
        for (int i = 0; i < list.size(); i++) {
            TreeNode node = list.get(i).left;
            if (node != null) {
                newList.add(node);
            }
            node = list.get(i).right;
            if (node != null) {
                newList.add(node);
            }
        }
        levelTravel(newList, result);
    }
}
