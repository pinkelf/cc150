package com.example.pack1to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 15/12/28.
 */
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return list;
        }

        perm(nums, 0, nums.length - 1, list);

        return list;

    }

    private static void perm(int[] nums, int start, int end, List<List<Integer>> result) {
        if (start == end) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < nums.length; j++) {
                list.add(nums[j]);
            }
            result.add(list);
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(start, i, nums);
            perm(nums, start + 1, end, result);
            swap(start, i, nums);
        }
    }

    private static void swap(int a, int b, int[] nums) {
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }
}
