package com.example.pack1to100;

/**
 * Created by Administrator on 2015/12/15.
 */
public class IntegerToRoman {
    /**
     * Given an integer, convert it to a roman numeral.
     * <p/>
     * Input is guaranteed to be within the range from 1 to 3999.
     *
     * @param num
     * @return
     */
    public static String intToRoman(int num) {
        // I������1����V������5����X������10����L������50����C����100����D������500����M������1,000��
        String roman = "";
        int count = 0;
        if (num == 0) {
            return roman;
        }
        while (num > 0) {
            count++;
            String l, m, h;
            if (count == 1) {
                l = "I";
                m = "V";
                h = "X";
            } else if (count == 2) {
                l = "X";
                m = "L";
                h = "C";
            } else if (count == 3) {
                l = "C";
                m = "D";
                h = "M";
            } else if (count == 4) {
                l = "M";
                m = "";
                h = "";
            } else {
                l = "";
                m = "";
                h = "";
            }
            roman = getString(num % 10, l, m, h) + roman;
            num = num / 10;
        }
        return roman;
    }

    private static String getString(int a, String l, String m, String h) {
        switch (a) {
            case 1:
                return l;
            case 2:
                return l + l;
            case 3:
                return l + l + l;
            case 4:
                return l + m;
            case 5:
                return m;
            case 6:
                return m + l;
            case 7:
                return m + l + l;
            case 8:
                return m + l + l + l;
            case 9:
                return l + h;
        }
        return "";
    }
}
