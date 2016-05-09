package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class ProductofArrayExceptSelf {
    /**
     * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
     * <p/>
     * Solve it without division and in O(n).
     * <p/>
     * For example, given [1,2,3,4], return [24,12,8,6].
     * <p/>
     * Follow up:
     * Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
     *
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int[] temp = new int[nums.length];
        temp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            temp[i] = temp[i - 1] * nums[i - 1];
        }

        int[] temp2 = new int[nums.length];
        temp2[nums.length - 1] = 1;
        for (int i = nums.length - 2; i > -1; i--) {
            temp2[i] = temp2[i + 1] * nums[i + 1];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = temp[i] * temp2[i];
        }

        return result;
    }
}
