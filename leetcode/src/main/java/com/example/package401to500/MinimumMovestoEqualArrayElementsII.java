package com.example.package401to500;

import java.util.Arrays;

/**
 * Created by majie on 16/11/30.
 */

public class MinimumMovestoEqualArrayElementsII {
    /**
     * Given a non-empty integer array, find the minimum number of moves required to make all array elements equal, where a move is incrementing a selected element by 1 or decrementing a selected element by 1.
     * <p>
     * You may assume the array's length is at most 10,000.
     * <p>
     * Example:
     * <p>
     * Input:
     * [1,2,3]
     * <p>
     * Output:
     * 2
     * <p>
     * Explanation:
     * Only two moves are needed (remember each move increments or decrements one element):
     * <p>
     * [1,2,3]  =>  [2,2,3]  =>  [2,2,2]
     *
     * @param nums
     * @return
     */
    public static int minMoves2(int[] nums) {
        // the important thing is to prove median is the best choice
        // assume there is an sorted array: {x1,x2,x3,x4,x5,x6,x7}
        // if choose x4, sum1 = x5-x3+x6-x2+x7-x1
        // if choose x5, sum2 = x7-x1+x6-x2+x5-x4+x5-x3
        // so sum2 - sum1 = x5-x4 >0
        // so sum 1< sum2.
        // you can use the QuickSelect method to get the median element, so it can be done in O(n) time.
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i] - median;
            if (tmp < 0) {
                count = count - tmp;
            } else {
                count = count + tmp;
            }
        }
        return count;
    }
}
