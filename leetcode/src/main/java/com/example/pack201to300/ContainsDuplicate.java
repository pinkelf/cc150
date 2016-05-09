package com.example.pack201to300;

import java.util.HashSet;

/**
 * Created by majie on 16/5/9.
 */
public class ContainsDuplicate {

    /**
     * Given an array of integers, find if the array contains any duplicates.
     * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
     *
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            //direct invoke add, check return value. faster than if contains then add.
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
