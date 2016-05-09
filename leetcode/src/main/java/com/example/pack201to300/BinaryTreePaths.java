package com.example.pack201to300;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/5/9.
 */
public class BinaryTreePaths {

    /**
     * Given a binary tree, return all root-to-leaf paths.
     * <p/>
     * For example, given the following binary tree:
     * <p/>
     * 1
     * /   \
     * 2     3
     * \
     * 5
     * All root-to-leaf paths are:
     * <p/>
     * ["1->2->5", "1->3"]
     *
     * @param root
     * @return
     */
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        getPath(root, "", result);
        return result;
    }

    private static void getPath(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            path = path + root.val;
            result.add(path);
        } else {
            path = path + root.val + "->";
            if (root.left != null) {
                getPath(root.left, path, result);
            }
            if (root.right != null) {
                getPath(root.right, path, result);
            }
        }
    }
}
