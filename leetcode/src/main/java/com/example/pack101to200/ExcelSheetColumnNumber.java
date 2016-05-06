package com.example.pack101to200;

/**
 * Created by majie on 16/5/6.
 */
public class ExcelSheetColumnNumber {

    /**
     * Related to question Excel Sheet Column Title
     * <p/>
     * Given a column title as appear in an Excel sheet, return its corresponding column number.
     * <p/>
     * For example:
     * <p/>
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     *
     * @param s
     * @return
     */
    public static int titleToNumber(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + (s.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}
