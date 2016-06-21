package com.example.pack201to300;

/**
 * Created by majie on 16/6/21.
 */
public class MinimumSizeSubarraySum {
    /**
     * Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum ≥ s. If there isn't one, return 0 instead.
     * <p/>
     * For example, given the array [2,3,1,2,4,3] and s = 7,
     * the subarray [4,3] has the minimal length under the problem constraint.
     *
     * @param s
     * @param nums
     * @return
     */
    public static int minSubArrayLen(int s, int[] nums) {
        int j = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= s) {
                sum -= nums[j];
                j++;
                min = Math.min(min, i - j + 2);
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
