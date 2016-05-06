package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/2/3.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
    /**
     * Given inorder and postorder traversal of a tree, construct the binary tree.
     * <p/>
     * Note:
     * You may assume that duplicates do not exist in the tree.
     *
     * @param inorder
     * @param postorder
     * @return
     */
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        return getTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private static TreeNode getTree(int[] inorder, int startI, int endI, int[] postorder, int startP, int endP) {
        if (startI >= inorder.length || startP >= postorder.length || endI == startI) {
            return null;
        }
        if (endI - startI == 1) {
            return new TreeNode(inorder[startI]);
        }
        TreeNode node = new TreeNode(postorder[endP - 1]);
        int index = -1;
        for (int i = startI; i < endI; i++) {
            if (inorder[i] == node.val) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            //same logic as inorder&preorder -> tree.
            //preorder = (root)(left...)(right...)
            //inorder = (left...)(root)(right...)
            //postorder =(left...)(right...)(root)
            node.left = getTree(inorder, startI, index, postorder, startP, index - startI + startP);
            node.right = getTree(inorder, index + 1, endI, postorder, endP + index - endI, endP - 1);
        }
        return node;
    }
}
