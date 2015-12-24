package com.example.pack1to50;

/**
 * Created by majie on 15/12/22.
 */
public class NextPermutation {
    /**
     * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
     * <p/>
     * If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
     * <p/>
     * The replacement must be in-place, do not allocate extra memory.
     * <p/>
     * Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
     * 1,2,3 → 1,3,2
     * 3,2,1 → 1,2,3
     * 1,1,5 → 1,5,1
     */
    public static void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }

        int i;
        for (i = length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                adjust(i - 1, nums);
                break;
            }
        }

        reOrder(i, nums);
    }

    private static void adjust(int start, int[] nums) {
        int value = nums[start];
        int index = start + 1;
        //find someone smaller
        while (index < nums.length) {
            if (value >= nums[index]) {
                nums[start] = nums[index - 1];
                nums[index - 1] = value;
                break;
            }
            index++;
        }
        //find no one smaller
        if (index == nums.length) {
            nums[start] = nums[nums.length - 1];
            nums[nums.length - 1] = value;
        }
    }

    private static void reOrder(int index, int[] nums) {
        int end = nums.length - 1;
        if (index == end) {
            return;
        }
        int temp;
        while (index < end) {
            temp = nums[index];
            nums[index] = nums[end];
            nums[end] = temp;
            index++;
            end--;
        }
    }
}
