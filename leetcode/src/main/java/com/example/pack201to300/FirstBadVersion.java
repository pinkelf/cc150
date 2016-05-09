package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class FirstBadVersion {
    private static boolean isBadVersion(int version) {
        return Math.random() > 0.5;
    }

    /**
     * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
     * <p/>
     * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
     * <p/>
     * You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
     *
     * @param n
     * @return
     */
    public static int firstBadVersion(int n) {
        return isBad(1, n);
    }

    private static int isBad(int start, int length) {
        if (length == 1) {
            if (isBadVersion(start)) {
                return start;
            } else {
                return start + 1;
            }
        }
        if (length == 2) {
            if (isBadVersion(start)) {
                return start;
            } else if (isBadVersion(start + 1)) {
                return start + 1;
            } else {
                return start + 2;
            }
        }
        //ignore the number start+length/2.
        //made more judge in the beginning. for case "ft" or "fft"
        if (isBadVersion(start + length / 2)) {
            return isBad(start, length / 2);
        } else {
            return isBad(start + 1 + length / 2, length - 1 - length / 2);
        }
    }
}
