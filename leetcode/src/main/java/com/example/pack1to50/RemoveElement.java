package com.example.pack1to50;

import java.util.Arrays;

/**
 * Created by Administrator on 2015/12/20.
 */
public class RemoveElement {
    /**
     * Given an array and a value, remove all instances of that value in place and return the new length.
     * <p/>
     * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        if (nums.length < 1) {
            return 0;
        }
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length && nums[i] != val) {
            i++;
        }
        if (i == nums.length) {
            return nums.length;
        }

        int j = i;
        while (j < nums.length && nums[j] == val) {
            j++;
        }
        if (j == nums.length) {
            return i;
        }
        for (int l = j, m = i; l < nums.length; l++, m++) {
            nums[m] = nums[l];
        }
        return i + nums.length - j;
    }
}
