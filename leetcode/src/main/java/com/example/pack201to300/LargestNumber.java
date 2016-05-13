package com.example.pack201to300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by majie on 16/5/13.
 */
public class LargestNumber {
    /**
     * Given a list of non negative integers, arrange them such that they form the largest number.
     * <p/>
     * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
     * <p/>
     * Note: The result may be very large, so you need to return a string instead of an integer.
     *
     * @param nums
     * @return
     */
    public static String largestNumber(int[] nums) {
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer lhs, Integer rhs) {
                String l = String.valueOf(lhs);
                String r = String.valueOf(rhs);

                if (l.charAt(0) > r.charAt(0)) {
                    return -1;
                } else if (l.charAt(0) < r.charAt(0)) {
                    return 1;
                } else {
                    return -(l + r).compareTo(r + l);
                }
            }
        };

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list, comp);

        StringBuilder buffer = new StringBuilder();
        boolean isZero = true;
        for (int i = 0; i < list.size(); i++) {
            buffer.append(list.get(i));
            if (list.get(i) != 0) {
                isZero = false;
            }
        }

        return isZero ? "0" : buffer.toString();
    }
}
