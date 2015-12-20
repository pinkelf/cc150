package com.example.pack21to40;

/**
 * Created by Administrator on 2015/12/20.
 */
public class RemoveDuplicatesfromSortedArray {
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
