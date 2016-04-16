package com.example.pack101to150;

import com.example.TreeNode;

/**
 * Created by Administrator on 2016/4/16.
 */
public class SumRoottoLeafNumbers {
    private static int sum;

    /**
     * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
     * <p/>
     * An example is the root-to-leaf path 1->2->3 which represents the number 123.
     * <p/>
     * Find the total sum of all root-to-leaf numbers.
     * <p/>
     * For example,
     * <p/>
     * 1
     * / \
     * 2   3
     * The root-to-leaf path 1->2 represents the number 12.
     * The root-to-leaf path 1->3 represents the number 13.
     * <p/>
     * Return the sum = 12 + 13 = 25.
     *
     * @param root
     * @return
     */
    public static int sumNumbers(TreeNode root) {
        sum = 0;
        sumNode(root, 0);
        return sum;
    }

    private static void sumNode(TreeNode node, int num) {
        if (node == null) {
            return;
        }

        num = num * 10 + node.val;
        if (node.left == null && node.right == null) {
            sum += num;
        } else if (node.left == null) {
            sumNode(node.right, num);
        } else if (node.right == null) {
            sumNode(node.left, num);
        } else {
            sumNode(node.left, num);
            sumNode(node.right, num);
        }
    }
}
