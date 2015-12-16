package com.example.pack1to20;

import java.util.Arrays;

/**
 * Created by majie on 15/12/16.
 */
public class ThreeSumClosest {

    /**
     * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
     * <p>
     * For example, given array S = {-1 2 1 -4}, and target = 1.
     * <p>
     * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     *
     * @param nums
     * @param target
     * @return
     */
    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length < 4) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[i];
            }
            return sum;
        }

        Arrays.sort(nums);
        int low = -1;
        int mid = -1;
        int high = -1;
        int diff = -1;
        boolean isPositive = true;

        for (int i = 0; i < nums.length - 2; i++) {
            int close = nums[i] - target;
            int m = i + 1;
            int n = nums.length - 1;
            while (m < n) {
                int result = nums[m] + nums[n] + close;
                if (diff == -1 || diff > Math.abs(result)) {
                    low = i;
                    mid = m;
                    high = n;
                    diff = Math.abs(result);
                    if (result > 0) {
                        isPositive = true;
                    } else if (result < 0) {
                        isPositive = false;
                    }
                } else if (diff == Math.abs(result)) {
                    if (result < 0) {
                        low = i;
                        mid = m;
                        high = n;
                        diff = Math.abs(result);
                    }
                }

                if (result == 0) {
                    return target;
                } else if (result > 0) {
                    n--;
                } else {
                    m++;
                }
            }
        }
        if (isPositive) {
            return target + diff;
        } else {
            return target - diff;
        }
    }
}
