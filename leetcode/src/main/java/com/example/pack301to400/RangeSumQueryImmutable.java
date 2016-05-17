package com.example.pack301to400;

/**
 * Created by majie on 16/5/17.
 */
public class RangeSumQueryImmutable {

    /**
     * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
     * <p/>
     * Example:
     * Given nums = [-2, 0, 3, -5, 2, -1]
     * <p/>
     * sumRange(0, 2) -> 1
     * sumRange(2, 5) -> -1
     * sumRange(0, 5) -> -3
     * Note:
     * You may assume that the array does not change.
     * There are many calls to sumRange function.
     */
    public class NumArray {
        int[] sums;

        public NumArray(int[] nums) {
            if (nums.length == 0) {
                return;
            }
            sums = new int[nums.length];
            sums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                sums[i] = sums[i - 1] + nums[i];
            }
        }

        public int sumRange(int i, int j) {
            if (i - 1 < 0) {
                return sums[j];
            } else {
                return sums[j] - sums[i - 1];
            }
        }
    }
}
