package com.example.pack1to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by majie on 15/12/28.
 */
public class CombinationSum {
    /**
     * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
     * <p>
     * The same repeated number may be chosen from C unlimited number of times.
     * <p>
     * Note:
     * All numbers (including target) will be positive integers.
     * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
     * The solution set must not contain duplicate combinations.
     * For example, given candidate set 2,3,6,7 and target 7,
     * A solution set is:
     *
     * @param candidates
     * @param target
     * @return
     */
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        getList(new ArrayList<Integer>(), target, 0, candidates, result);

        return result;

    }

    private static void getList(ArrayList<Integer> list, int target, int index, int[] nums, List<List<Integer>> result) {
        for (int i = index; i < nums.length; i++) {
            if (nums[i] < target) {
                list.add(nums[i]);
                getList(list, target - nums[i], i, nums, result);
                list.remove(list.size() - 1);
            } else if (nums[i] == target) {
                list.add(nums[i]);
                result.add(new ArrayList<Integer>(list));
                list.remove(list.size() - 1);
            }
        }
    }
}
