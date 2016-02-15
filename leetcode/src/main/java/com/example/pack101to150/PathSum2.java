package com.example.pack101to150;

import com.example.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/2/5.
 */
public class PathSum2 {
    /**
     * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
     * <p/>
     * For example:
     * Given the below binary tree and sum = 22,
     * 5
     * / \
     * 4   8
     * /   / \
     * 11  13  4
     * /  \    / \
     * 7    2  5   1
     * return
     * [
     * [5,4,11,2],
     * [5,8,4,5]
     * ]
     *
     * @param root
     * @param sum
     * @return
     */
    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null) {
            return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        getPath(root, sum, result, list);
        return result;
    }

    private static void getPath(TreeNode root, int sum, List<List<Integer>> result, List<Integer> list) {
        if (root == null) {
            return;
        }

        if (root.val == sum && root.left == null && root.right == null) {
            list.add(root.val);
            ArrayList list2 = new ArrayList<Integer>();
            list2.addAll(list);
            result.add(list2);
            //notice the difference of remove(int) & remove(object).
            //get last index to remove the correct object
            int index = list.lastIndexOf(root.val);
            list.remove(index);
            return;
        } else {
            list.add(new Integer(root.val));
            if (root.left != null) {
                getPath(root.left, sum - root.val, result, list);
            }
            if (root.right != null) {
                getPath(root.right, sum - root.val, result, list);
            }
            int index = list.lastIndexOf(root.val);
            list.remove(index);
        }
    }
}
