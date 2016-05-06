package com.example.pack1to100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by majie on 16/1/13.
 */
public class Subsets {
    /**
     * Given a set of distinct integers, nums, return all possible subsets.
     * <p/>
     * Note:
     * Elements in a subset must be in non-descending order.
     * The solution set must not contain duplicate subsets.
     * For example,
     * If nums = [1,2,3], a solution is:
     * <p/>
     * [
     * [3],
     * [1],
     * [2],
     * [1,2,3],
     * [1,3],
     * [2,3],
     * [1,2],
     * []
     * ]
     *
     * @param nums
     * @return
     */
    //recursive, subset(n) = all set with [n]  + subset(n-1). from end to start.
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.addAll(getSubset(nums, nums.length - 1));
        return result;
    }

    private static List<List<Integer>> getSubset(int[] nums, int index) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (index == 0) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(nums[index]);
            result.add(list);
        } else {
            List<List<Integer>> list1 = getSubset(nums, index - 1);
            List<List<Integer>> list3 = getSubset(nums, index - 1);
            result.addAll(list3);
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            list2.add(nums[index]);
            result.add(list2);
            for (int i = 0; i < list1.size(); i++) {
                list1.get(i).add(0, nums[index]);
                //sort by problem's request
                Collections.sort(list1.get(i));
            }
            result.addAll(list1);
        }
        return result;
    }


    //Not the same order as leetcode oj, not accepted...
    //get all length combinations
    public static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        for (int i = 1; i <= nums.length; i++) {
            result.addAll(combine(nums, i, 0));
        }
        return result;
    }

    private static List<List<Integer>> combine(int[] nums, int k, int index) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k == 1) {
            for (int i = index; i < nums.length; i++) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(nums[i]);
                result.add(list);
            }
            return result;
        }
        if (nums.length - k == index) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < k; i++) {
                list.add(nums[i + index]);
            }
            result.add(list);
            return result;
        }
        List<List<Integer>> result1 = combine(nums, k - 1, index + 1);
        for (int i = 0; i < result1.size(); i++) {
            result1.get(i).add(0, nums[index]);
        }
        result.addAll(result1);
        result.addAll(combine(nums, k, index + 1));
        return result;
    }
}
