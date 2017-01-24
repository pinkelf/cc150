package com.example.package401to500;

/**
 * 1. The area of the rectangular web page you designed must equal to the given target area.
 * <p>
 * 2. The width W should not be larger than the length L, which means L >= W.
 * <p>
 * 3. The difference between length L and width W should be as small as possible.
 * Created by majie on 17/1/24.
 */

public class ConstructtheRectangle {
    public static int[] constructRectangle(int area) {
        int[] rec = new int[]{area, 1};
        for (int i = 2; i < area; i++) {
            if (area % i == 0) {
                int width = area / i;
                if (width < i) {
                    break;
                }
                rec[0] = width;
                rec[1] = i;
            }
        }
        return rec;
    }
}
