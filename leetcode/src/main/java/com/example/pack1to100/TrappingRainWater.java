package com.example.pack1to100;

/**
 * Created by majie on 15/12/24.
 */
public class TrappingRainWater {
    /**
     * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
     * <p/>
     * For example,
     * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
     *
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        return compute(0, height.length - 1, height);
    }

    private static int compute(int start, int end, int[] height) {
        if (start > end - 2) {
            return 0;
        }
        int index = findHighest(start, end, height);

        if (height[start] >= height[index] && height[end] >= height[index]) {
            return trapSize(start, end, height);
        } else {
            return compute(start, index, height) + compute(index, end, height);
        }
    }

    private static int trapSize(int start, int end, int[] height) {
        int min = Math.min(height[start], height[end]);
        int count = 0;
        for (int i = start; i < end + 1; i++) {
            if (min - height[i] > 0) {
                count = count + (min - height[i]);
            }
        }
        return count;
    }

    private static int findHighest(int start, int end, int[] height) {
        int max = -1;
        int index = -1;
        for (int i = start + 1; i < end; i++) {
            if (max < height[i]) {
                max = height[i];
                index = i;
            }
        }
        return index;
    }

}
