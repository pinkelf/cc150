package com.example.pack51to100;

/**
 * Created by majie on 16/1/8.
 */
public class SortColors {

    /**
     * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
     * <p/>
     * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
     * <p/>
     * Note:
     * You are not suppose to use the library's sort function for this problem.
     *
     * @param nums
     */

    // tri-way qsort
    public static void sortColors(int[] nums) {
        int index0 = 0, index1 = 0, index2 = nums.length - 1;
        for (int i = 0; i <= index2; i++) {
            if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[index2];
                nums[index2] = temp;
                index2--;
                i--;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[index0];
                nums[index0] = temp;
                index0++;
                index1++;
            } else if (nums[i] == 1) {
                index1++;
            }
        }
    }

    public static void sortColors2(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int j = 0;
        for (j = 0; j < count0; j++) {
            nums[j] = 0;
        }
        for (; j < count1 + count0; j++) {
            nums[j] = 1;
        }
        for (; j < count2 + count1 + count0; j++) {
            nums[j] = 2;
        }
    }
}
