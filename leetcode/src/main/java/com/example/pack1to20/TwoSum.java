package com.example.pack1to20;

/**
 * Created by majie on 15/12/15.
 */
public class TwoSum {

    /**
     * 1. TWO SUM
     * <p/>
     * Given an array of integers, find two numbers such that they add up to a specific target number.
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution.
     * Input: numbers={2, 7, 11, 15}, target=9
     * Output: index1=1, index2=2
     */
    public static int[] twoSum(int[] nums, int target) {
        int index1;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            index1 = nums[i];
            for (int j = i + 1; j < size; j++) {
                if ((index1 + nums[j]) == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{0, 0};
    }
}
