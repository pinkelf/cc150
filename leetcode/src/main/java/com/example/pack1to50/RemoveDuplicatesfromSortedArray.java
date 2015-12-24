package com.example.pack1to50;

/**
 * Created by Administrator on 2015/12/20.
 */
public class RemoveDuplicatesfromSortedArray {
    /**
     * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
     * <p/>
     * Do not allocate extra space for another array, you must do this in place with constant memory.
     * <p/>
     * For example,
     * Given input array nums = [1,1,2],
     * <p/>
     * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int size = 0;
        int i = 0;
        int length = nums.length;
        if (length < 2) {
            return length;
        }
        while (i < length) {
            if (i == length - 1) {
                nums[size] = nums[i];
                size++;
            } else if (nums[i] != nums[i + 1]) {
                nums[size] = nums[i];
                size++;
            }
            i++;
        }
        return size;
    }
}
