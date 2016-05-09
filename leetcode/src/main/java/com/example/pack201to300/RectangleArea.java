package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class RectangleArea {
    /**
     * Find the total area covered by two rectilinear rectangles in a 2D plane.
     * <p/>
     * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
     * <p/>
     * Rectangle Area
     * Assume that the total area is never beyond the maximum possible value of int.
     *
     * @param A
     * @param B
     * @param C
     * @param D
     * @param E
     * @param F
     * @param G
     * @param H
     * @return
     */
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a = (C - A) * (D - B);
        int b = (G - E) * (H - F);
        int x = Math.min(C, G) < Math.max(A, E) ? 0 : Math.min(C, G) - Math.max(A, E);
        int y = Math.min(D, H) < Math.max(B, F) ? 0 : Math.min(D, H) - Math.max(B, F);
        return a + b - x * y;
    }
}
