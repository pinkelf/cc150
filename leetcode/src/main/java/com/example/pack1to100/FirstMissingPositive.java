package com.example.pack1to100;

/**
 * Created by majie on 15/12/24.
 */
public class FirstMissingPositive {

    /**
     * Given an unsorted integer array, find the first missing positive integer.
     * <p>
     * For example,
     * Given [1,2,0] return 3,
     * and [3,4,-1,1] return 2.
     * <p>
     * Your algorithm should run in O(n) time and uses constant space.
     *
     * @param nums
     * @return
     */

    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //set other values to 0
            if (nums[i] < 1 || nums[i] > nums.length) {
                nums[i] = 0;
            }
            //try to put the value into the correct index
            if (nums[i] != i + 1 && nums[i] != 0) {
                int j = nums[i];
                //if nums are duplicated, change self to 0, keep the correct value in correct index.
                if (j == nums[j - 1]) {
                    nums[i] = 0;
                    continue;
                }
                //switch the value to the correct index. notice that next loop start from the same i;
                int temp = nums[j - 1];
                nums[j - 1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        //check the first nums[m]==0, otherwise, it should be nums.length+1
        for (int m = 0; m < nums.length; m++) {
            if (nums[m] == 0) {
                return m + 1;
            }
        }
        return nums.length + 1;
    }
}
