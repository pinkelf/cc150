package com.example.pack1to100;

import com.example.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/6/23.
 */
public class UniqueBinarySearchTreesII {

    /**
     * Given an integer n, generate all structurally unique BST's (binary search trees) that store values 1...n.
     * <p/>
     * For example,
     * Given n = 3, your program should return all 5 unique BST's shown below.
     * <p/>
     * 1         3     3      2      1
     * \       /     /      / \      \
     * 3     2     1      1   3      2
     * /     /       \                 \
     * 2     1         2                 3
     *
     * @param n
     * @return
     */
    public static List<TreeNode> generateTrees(int n) {
        return getSubTree(1, n);
    }

    private static List<TreeNode> getSubTree(int left, int right) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (left == right) {
            list.add(new TreeNode(left));
            return list;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> leftList = getSubTree(left, i - 1);
            List<TreeNode> rightList = getSubTree(i + 1, right);
            if (leftList.isEmpty()) {
                for (int a = 0; a < rightList.size(); a++) {
                    TreeNode node = new TreeNode(i);
                    node.left = null;
                    node.right = rightList.get(a);
                    list.add(node);
                }
            } else if (rightList.isEmpty()) {
                for (int a = 0; a < leftList.size(); a++) {
                    TreeNode node = new TreeNode(i);
                    node.right = null;
                    node.left = leftList.get(a);
                    list.add(node);
                }
            } else {
                for (int a = 0; a < leftList.size(); a++) {
                    for (int b = 0; b < rightList.size(); b++) {
                        TreeNode node = new TreeNode(i);
                        node.left = leftList.get(a);
                        node.right = rightList.get(b);
                        list.add(node);
                    }
                }
            }
        }
        return list;
    }
}
