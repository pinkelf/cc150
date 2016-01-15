package com.example.pack51to100;

/**
 * Created by majie on 16/1/15.
 */
public class MaximumSubarray {

    /**
     * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
     * <p>
     * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
     * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
     *
     * @param nums
     * @return
     */
    //O(n) solution.
    //consider int[] are mixed with >0 & <0, one by one.
    //such as(1,2,-2,2,3,-5,-1,5,4) -> (3,-2,5,-7,9).
    // pos=3, pre =3;
    // neg=-2, pre-2>0 -> pre =1.
    // pos=5, pre =6;
    // neg=-7, pre-7 <=0 -> pre=0.
    // pos =9, pre =9.
    // end.
    public static int maxSubArray(int[] nums) {

        int pre = 0;
        int pos = 0;
        int neg = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] > 0) {
                while (i < nums.length && nums[i] > 0) {
                    pos += nums[i];
                    i++;
                }
                pre += pos;
                pos = 0;
                max = Math.max(max, pre);
            } else if (nums[i] < 0) {
                while (i < nums.length && nums[i] < 0) {
                    neg += nums[i];
                    //in case all int are negtive.
                    if (max < 0) {
                        max = Math.max(max, nums[i]);
                    }
                    i++;
                }
                if (neg + pre <= 0) {
                    pre = 0;
                } else {
                    pre += neg;
                }
                neg = 0;
            } else {
                while (i < nums.length && nums[i] == 0) {
                    i++;
                    //in case all int are 0.
                    max = Math.max(max, 0);
                }
            }
        }
        return max;
    }
}
