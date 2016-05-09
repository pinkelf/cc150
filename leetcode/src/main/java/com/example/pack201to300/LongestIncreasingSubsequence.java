package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class LongestIncreasingSubsequence {

    /**
     * Given an unsorted array of integers, find the length of longest increasing subsequence.
     * <p/>
     * For example,
     * Given [10, 9, 2, 5, 3, 7, 101, 18],
     * The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.
     * <p/>
     * Your algorithm should run in O(n2) complexity.
     * <p/>
     * Follow up: Could you improve it to O(n log n) time complexity?
     *
     * @param nums
     * @return
     */
    public static int lengthOfLIS(int[] nums) {
        int max = 0;
        //nums[i] = max(nums[j])+1, which  nums[j] < nums[i]; otherwise nums[i] = 1;
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            int premax = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    premax = Math.max(dp[j], premax);
                }
            }
            dp[i] += premax;
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
