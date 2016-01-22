package com.example.pack51to100;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by majie on 16/1/22.
 */
public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        inOrder(root, result);
        return result;
    }

    private static void inOrder(TreeNode node, List<Integer> list) {
        if (node.left != null) {
            inOrder(node.left, list);
        }
        list.add(node.val);
        if (node.right != null) {
            inOrder(node.right, list);
        }
    }
}
