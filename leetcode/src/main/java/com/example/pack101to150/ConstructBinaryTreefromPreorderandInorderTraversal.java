package com.example.pack101to150;

import com.example.TreeNode;

import java.util.ArrayList;


/**
 * Created by majie on 16/1/28.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }
        return getTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private static TreeNode getTree(int[] pre, int startP, int endP, int[] in, int startI, int endI) {
        if (endP - startP != endI - startI || startP == endP || startI == endI) {
            //error
            return null;
        }
        if (endP - startP == 1) {
            //only one element, return its node.
            return new TreeNode(pre[startP]);
        }
        int val = pre[startP];
        TreeNode root = new TreeNode(val);
        int index = -1;
        for (int i = startI; i < endI; i++) {
            if (val == in[i]) {
                index = i;
                break;
            }
        }
        //find the index in inorder, then keep endP - startP == endI - startI
        if (index != -1) {
            root.left = getTree(pre, startP + 1, startP + index - startI + 1, in, startI, index);
            root.right = getTree(pre, index + 1 + endP - endI, endP, in, index + 1, endI);
        }
        return root;
    }

    //use ArrayList, more costs
    public static TreeNode buildTree2(int[] preorder, int[] inorder) {
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
