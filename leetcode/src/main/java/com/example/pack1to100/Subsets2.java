package com.example.pack1to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by majie on 16/6/21.
 */
public class Subsets2 {

    /**
     * Given a collection of integers that might contain duplicates, nums, return all possible subsets.
     * <p/>
     * Note: The solution set must not contain duplicate subsets.
     * <p/>
     * For example,
     * If nums = [1,2,2], a solution is:
     * <p/>
     * [
     * [2],
     * [1],
     * [1,2,2],
     * [2,2],
     * [1,2],
     * []
     * ]
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        dfs(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }

    //consider a int[] {1,1,1,2,3} as {(1),2,3},{(1,1),2,3},{(1,1,1),2,3}
    private static void dfs(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        result.add(list);

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            ArrayList<Integer> temp = new ArrayList<Integer>(list);
            temp.add(nums[i]);
            dfs(nums, i + 1, temp, result);
        }
    }
}
