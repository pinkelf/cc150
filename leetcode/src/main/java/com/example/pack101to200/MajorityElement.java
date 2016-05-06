package com.example.pack101to200;

/**
 * Created by majie on 16/5/6.
 */
public class MajorityElement {

    /**
     * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
     * <p/>
     * You may assume that the array is non-empty and the majority element always exist in the array.
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                num = nums[i];
            }
            if (nums[i] == num) {
                count++;
            } else {
                count--;
            }
        }
        return num;
    }
}
