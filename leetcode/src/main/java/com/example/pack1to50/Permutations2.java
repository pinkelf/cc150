package com.example.pack1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by majie on 15/12/28.
 */
public class Permutations2 {
    /**
     * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
     * <p/>
     * For example,
     * [1,1,2] have the following unique permutations:
     * [1,1,2], [1,2,1], and [2,1,1].
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        int count = 0;
        while (true) {
            //try to find next number by dictionary order
            NextPermutation.nextPermutation(nums);
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            if (result.contains(list)) {
                //break when same number appears.
                break;
            } else {
                result.add(list);
            }
        }
        return result;
    }
}
