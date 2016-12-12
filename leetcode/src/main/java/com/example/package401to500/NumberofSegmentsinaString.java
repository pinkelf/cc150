package com.example.package401to500;

/**
 * Created by majie on 16/12/9.
 */

public class NumberofSegmentsinaString {
    /**
     * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
     * <p>
     * Please note that the string does not contain any non-printable characters.
     * <p>
     * Example:
     * <p>
     * Input: "Hello, my name is John"
     * Output: 5
     *
     * @param s
     * @return
     */
    public static int countSegments(String s) {
        int count = 0;
        s = " " + s;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                count++;
            }
        }
        return count;
    }
}
