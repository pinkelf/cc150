package com.example.pack21to40;

/**
 * Created by Administrator on 2015/12/20.
 */
public class ImplementstrStr {
    /**
     * Implement strStr().
     * <p/>
     * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        int length = haystack.length();
        int size = needle.length();
        int i = 0;
        int j = 0;

        while (i < length && j < size) {
            if (haystack.charAt(i) != needle.charAt(j)) {
                //FIXME maybe wrong, accept but looks werid. will update with KMP.
                i = i - j + 1;
                j = 0;
            } else {
                i++;
                j++;
            }
        }
        if (j == size) {
            return i - j;
        } else {
            return -1;
        }
    }
}
