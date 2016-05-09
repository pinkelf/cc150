package com.example.pack201to300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/5/9.
 */
public class MajorityElement2 {

    /**
     * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. The algorithm should run in linear time and in O(1) space.
     *
     * @param nums
     * @return
     */
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        int a = 0;
        int counta = 0;
        int b = 0;
        int countb = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (a == temp && counta > 0) {
                counta++;
            } else if (b == temp && countb > 0) {
                countb++;
            } else if (counta == 0) {
                a = temp;
                counta++;
            } else if (countb == 0) {
                b = temp;
                countb++;
            } else {
                counta--;
                countb--;
            }
        }

        counta = 0;
        countb = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == a) {
                counta++;
            }
            if (nums[i] == b) {
                countb++;
            }
        }
        if (counta > nums.length / 3) {
            list.add(a);
        }
        if (countb > nums.length / 3 && b != a) {
            list.add(b);
        }
        return list;
    }
}
