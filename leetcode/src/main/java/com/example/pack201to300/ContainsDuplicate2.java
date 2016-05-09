package com.example.pack201to300;

import java.util.HashSet;

/**
 * Created by majie on 16/5/9.
 */
public class ContainsDuplicate2 {

    /**
     * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int index = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        while (index < k + 1 && index < nums.length) {
            if (!set.add(nums[index])) {
                return true;
            }
            index++;
        }

        for (int i = index; i < nums.length; i++) {
            set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
