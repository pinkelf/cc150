package com.example.pack1to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2015/12/15.
 */
public class ThreeSum {

    /**
     * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
     * <p/>
     * Note:
     * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a �� b �� c)
     * The solution set must not contain duplicate triplets.
     * For example, given array S = {-1 0 1 2 -1 -4},
     * <p/>
     * A solution set is:
     * (-1, 0, 1)
     * (-1, -1, 2)
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (i + 1 < nums.length && nums[i + 1] == nums[i]) i++;
                    while (low + 1 < nums.length && nums[low] == nums[low + 1]) low++;
                    while (high - 1 >= 0 && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[i] + nums[low] + nums[high] > 0) {
                    high--;
                } else {
                    low++;

                }
            }
        }
        return result;
    }
}
