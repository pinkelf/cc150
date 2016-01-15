package com.example.pack51to100;

/**
 * Created by majie on 16/1/14.
 */
public class LargestRectangleInHistogram {

    /**
     * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
     * <p>
     * <p>
     * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
     * <p>
     * <p>
     * The largest rectangle is shown in the shaded area, which has area = 10 unit.
     * <p>
     * For example,
     * Given height = [2,1,5,6,2,3],
     * return 10.
     *
     * @param height
     * @return
     */
    //stack, o(n)
    public static int largestRectangleArea(int[] height) {
        return 0;
    }

    //Segment Tree, o(nlogn)
    public static int largestRectangleArea1(int[] height) {
        return 0;
    }


    //brute force, o(n2);
    public static int largestRectangleArea2(int[] height) {
        int l = 0;
        int h = 0;
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            int high = height[i];
            l = i;
            h = i;
            while (l > -1 && height[l] >= height[i]) {
                l--;
            }
            while (h < height.length && height[h] >= height[i]) {
                h++;
            }
            max = Math.max(max, (h - l - 1) * high);
        }
        return max;
    }
}
