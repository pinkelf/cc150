package com.example.pack1to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by majie on 15/12/28.
 */
public class CombinationSum2 {

    /**
     * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
     * <p/>
     * Each number in C may only be used once in the combination.
     * <p/>
     * Note:
     * All numbers (including target) will be positive integers.
     * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
     * The solution set must not contain duplicate combinations.
     * For example, given candidate set 10,1,2,7,6,1,5 and target 8,
     * A solution set is:
     * [1, 7]
     * [1, 2, 5]
     * [2, 6]
     * [1, 1, 6]
     *
     * @param candidates
     * @param target
     * @return
     */
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        getList(target, 0, new ArrayList<Integer>(), candidates, result);

        return result;
    }

    private static void getList(int target, int index, ArrayList<Integer> list, int[] nums, List<List<Integer>> result) {
        for (int i = index; i < nums.length; i++) {
            if (target > nums[i]) {
                list.add(nums[i]);
                getList(target - nums[i], i + 1, list, nums, result);
                list.remove(list.size() - 1);
            } else if (target == nums[i]) {
                list.add(nums[i]);
                ArrayList<Integer> newList = new ArrayList(list);
                if (!result.contains(newList)) {
                    result.add(new ArrayList<Integer>(list));
                }
                list.remove(list.size() - 1);
            }
        }
    }
}
