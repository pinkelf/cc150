package com.example.pack1to20;

/**
 * Created by Administrator on 2015/12/15.
 */
public class ContainerWithMostWater {
    /**
     * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
     * <p/>
     * Note: You may not slant the container.
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int max = 0;
        int length = height.length;
        int h;
        for (int i = 0, j = length - 1; i < j; ) {
            h = Math.min(height[i], height[j]);
            max = Math.max(max, (j - i) * h);
            while (h >= height[i] && i < j) {
                i++;
            }
            while (h >= height[j] && i < j) {
                j--;
            }
        }
        return max;
    }
}
