package com.example.pack101to200;

/**
 * Created by majie on 16/5/6.
 */
public class ExcelSheetColumnTitle {
    /**
     * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
     * <p/>
     * For example:
     * <p/>
     * 1 -> A
     * 2 -> B
     * 3 -> C
     * ...
     * 26 -> Z
     * 27 -> AA
     * 28 -> AB
     *
     * @param n
     * @return
     */
    public static String convertToTitle(int n) {
        String title = "";
        while (n > 0) {
            title = String.valueOf((char) ((n - 1) % 26 + 'A')) + title;
            n = (n - 1) / 26;
        }
        return title;
    }
}
