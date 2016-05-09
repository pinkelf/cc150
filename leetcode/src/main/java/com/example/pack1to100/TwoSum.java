package com.example.pack1to100;

import com.example.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by majie on 15/12/15.
 */
public class TwoSum {

    /**
     * 1. TWO SUM
     * <p/>
     * Given an array of integers, find two numbers such that they add up to a specific target number.
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution.
     * Input: numbers={2, 7, 11, 15}, target=9
     * Output: index1=1, index2=2
     */
    public static int[] twoSum(int[] nums, int target) {
        List<Point> list = new ArrayList<Point>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new Point(nums[i], i));
        }

        Comparator<Point> comp = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.x - o2.x;
            }
        };
        Collections.sort(list, comp);

        for (int i = 0, j = list.size() - 1; i < j; ) {
            int temp = list.get(i).x + list.get(j).x;
            if (temp > target) {
                j--;
            } else if (temp < target) {
                i++;
            } else {
                return new int[]{list.get(i).y, list.get(j).y};
            }
        }

        return new int[]{0, 0};
    }
}
