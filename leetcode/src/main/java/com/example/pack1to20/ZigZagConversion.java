package com.example.pack1to20;

import java.util.ArrayList;

/**
 * Created by majie on 15/12/15.
 */
public class ZigZagConversion {
    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
     * <p/>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     * Write the code that will take a string and make this conversion given a number of rows:
     * <p/>
     * string convert(string text, int nRows);
     * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
     */

    public static String convert(String s, int numRows) {
        int length = s.length();
        if (length <= numRows || numRows < 2) {
            return s;
        }
        ArrayList<StringBuilder> list = new ArrayList<StringBuilder>();
        for (int l = 0; l < numRows; l++) {
            list.add(new StringBuilder());
        }
        for (int i = 0; i < length; i++) {
            int index = (i + 1) % (2 * numRows - 2);
            if (index == 0) {
                list.get(1).append(s.charAt(i));
            } else if (index <= numRows) {
                list.get(index - 1).append(s.charAt(i));
            } else {
                list.get(2 * numRows - index - 1).append(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        for (int l = 0; l < numRows; l++) {
            result.append(list.get(l));
        }
        return result.toString();
    }
}
