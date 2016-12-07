package com.example.package401to500;

/**
 * Created by majie on 16/12/7.
 */

public class ArrangingCoins {

    /**
     * You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
     * <p>
     * Given n, find the total number of full staircase rows that can be formed.
     * <p>
     * n is a non-negative integer and fits within the range of a 32-bit signed integer.
     * <p>
     * Example 1:
     * <p>
     * n = 5
     * <p>
     * The coins can form the following rows:
     * ¤
     * ¤ ¤
     * ¤ ¤
     * <p>
     * Because the 3rd row is incomplete, we return 2.
     *
     * @param n
     * @return
     */
    public static int arrangeCoins(int n) {
        int index = 0;
        while (n >= 0) {
            index++;
            n -= index;
        }
        return index - 1;
    }
}
