package com.example.pack101to200;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Administrator on 2016/4/16.
 */
public class BinaryTreePostorderTraversal {
    /**
     * Given a binary tree, return the postorder traversal of its nodes' values.
     * <p/>
     * For example:
     * Given binary tree {1,#,2,3},
     * 1
     * \
     * 2
     * /
     * 3
     * return [3,2,1].
     *
     * @param root
     * @return
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode pre = null;
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.peek();
            if (pre != null && (pre == root.left || pre == root.right)) {
                result.add(root.val);
                stack.pop();
                pre = root;
            } else {
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
                if (root.left == null && root.right == null) {
                    result.add(root.val);
                    stack.pop();
                    pre = root;
                }
            }
        }

        return result;
    }
}
