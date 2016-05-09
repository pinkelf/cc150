package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class MissingNumber {
    /**
     * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
     * <p/>
     * For example,
     * Given nums = [0, 1, 3] return 2.
     * <p/>
     * Note:
     * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
     *
     * @param nums
     * @return
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }
}
