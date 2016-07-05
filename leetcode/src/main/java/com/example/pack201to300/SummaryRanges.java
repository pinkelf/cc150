package com.example.pack201to300;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/7/5.
 */
public class SummaryRanges {
    /**
     * Given a sorted integer array without duplicates, return the summary of its ranges.
     * <p/>
     * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
     *
     * @param nums
     * @return
     */
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        if (nums.length == 0) {
            return list;
        }

        int left = nums[0];
        int last = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (last == nums[i] - 1) {
                last++;
            } else {
                list.add(last != left ? left + "->" + last : left + "");
                left = nums[i];
                last = nums[i];
            }
        }

        //handle last string
        list.add(last != left ? left + "->" + last : left + "");

        return list;
    }
}
