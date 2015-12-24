package com.example.pack1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by majie on 15/12/16.
 */
public class FourSum {
    /**
     * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
     * <p>
     * Note:
     * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
     * The solution set must not contain duplicate quadruplets.
     * For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
     * <p>
     * A solution set is:
     * (-1,  0, 0, 1)
     * (-2, -1, 1, 2)
     * (-2,  0, 0, 2)
     */


    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (length < 4) {
            return list;
        }

        Arrays.sort(nums);
        for (int i = 0; i < length - 3; i++) {
            for (int j = i + 1; j < length - 2; j++) {
                int sum = nums[i] + nums[j] - target;
                int m = j + 1;
                int n = length - 1;
                while (m < n) {
                    int result = nums[m] + nums[n] + sum;
                    if (result == 0) {
                        ArrayList<Integer> item = new ArrayList<Integer>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[m]);
                        item.add(nums[n]);
                        if (!list.contains(item)) {
                            list.add(item);
                        }
                        m++;
                        n--;
                    } else if (result > 0) {
                        n--;
                    } else {
                        m++;
                    }
                }
            }
        }
        return list;
    }

}
