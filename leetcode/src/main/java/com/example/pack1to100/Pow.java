package com.example.pack1to100;

/**
 * Created by majie on 15/12/31.
 */
public class Pow {

    /**
     * Implement pow(x, n).
     *
     * @param x
     * @param n
     * @return
     */
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        boolean isNeg = false;
        if (n < 0) {
            isNeg = true;
            n = Math.abs(n);
        }
        double result;
        if (n % 2 == 0) {
            result = myPow(x * x, n / 2);
        } else {
            result = x * myPow(x * x, n / 2);
        }
        if (isNeg) {
            result = 1 / result;
        }
        return result;
    }
}
