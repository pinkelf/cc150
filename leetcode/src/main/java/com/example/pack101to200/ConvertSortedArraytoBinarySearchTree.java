package com.example.pack101to200;

import com.example.*;

/**
 * Created by majie on 16/2/3.
 */
public class ConvertSortedArraytoBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return getTree(nums, 0, nums.length);
    }

    private static TreeNode getTree(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }
        if (end - start == 1) {
            return new TreeNode(nums[start]);
        }
//        int index = (end + start) / 2;
        int index;
        if ((end - start) % 2 == 1) {
            index = (end + start) / 2;
        } else {
            index = (end + start) / 2 - 1;
        }
        TreeNode node = new TreeNode(nums[index]);
        node.left = getTree(nums, start, index);
        node.right = getTree(nums, index + 1, end);
        return node;
    }
}
