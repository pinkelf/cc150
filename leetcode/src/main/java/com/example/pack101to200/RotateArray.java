package com.example.pack101to200;

/**
 * Created by majie on 16/5/6.
 */
public class RotateArray {

    /**
     * Rotate an array of n elements to the right by k steps.
     * <p/>
     * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
     * <p/>
     * Note:
     * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if (nums.length == 0) {
            return;
        }
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int i = nums[start];
            nums[start] = nums[end];
            nums[end] = i;
            start++;
            end--;
        }
    }
}
