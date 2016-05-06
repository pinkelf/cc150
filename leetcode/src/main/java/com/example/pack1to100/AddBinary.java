package com.example.pack1to100;

/**
 * Created by majie on 16/1/6.
 */
public class AddBinary {
    /**
     * Given two binary strings, return their sum (also a binary string).
     * <p>
     * For example,
     * a = "11"
     * b = "1"
     * Return "100".
     */
    public static String addBinary(String a, String b) {
        String c = "";
        boolean addOne = false;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i > -1 || j > -1) {
            char itemA = (i > -1) ? a.charAt(i) : '0';
            char itemB = (j > -1) ? b.charAt(j) : '0';
            if (itemA == '1' && itemB == '1') {
                if (addOne) {
                    c = "1" + c;
                    addOne = true;
                } else {
                    c = "0" + c;
                    addOne = true;
                }
            } else if (itemA == '0' && itemB == '0') {
                if (addOne) {
                    c = "1" + c;
                    addOne = false;
                } else {
                    c = "0" + c;
                    addOne = false;
                }
            } else {
                if (addOne) {
                    c = "0" + c;
                    addOne = true;
                } else {
                    c = "1" + c;
                    addOne = false;
                }
            }
            i--;
            j--;
        }
        if (addOne) {
            c = "1" + c;
        }
        return c;
    }
}
