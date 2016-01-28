package com.example.pack101to150;

import com.example.TreeNode;

import java.util.ArrayList;


/**
 * Created by majie on 16/1/28.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {

    //FIXME TLE
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        ArrayList<Integer> preList = new ArrayList<Integer>();
        for (int i = 0; i < preorder.length; i++) {
            preList.add(preorder[i]);
        }
        return getTree(preList, inorder, 0, inorder.length);
    }

    private static TreeNode getTree(ArrayList<Integer> pre, int[] inorder, int start, int end) {
        if (pre.isEmpty()) {
            return null;
        }
        int val = pre.get(0);
        TreeNode root = new TreeNode(val);
        int index = -1;
        for (int i = start; i < end; i++) {
            if (val == inorder[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            ArrayList<Integer> preLeft = getPreList(pre, inorder, start, index);
            ArrayList<Integer> preRight = getPreList(pre, inorder, index + 1, end);
            root.left = getTree(preLeft, inorder, start, index);
            root.right = getTree(preRight, inorder, index, end);
        }
        return root;
    }

    private static ArrayList<Integer> getPreList(ArrayList<Integer> pre, int[] inorder, int start, int end) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < pre.size(); i++) {
            for (int j = start; j < end; j++) {
                if (pre.get(i) == inorder[j]) {
                    list.add(pre.get(i));
                    break;
                }
            }
        }
        return list;
    }
}
