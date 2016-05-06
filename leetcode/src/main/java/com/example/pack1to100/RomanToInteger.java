package com.example.pack1to100;

/**
 * Created by Administrator on 2015/12/15.
 */
public class RomanToInteger {
    /**
     * Given a roman numeral, convert it to an integer.
     * <p/>
     * Input is guaranteed to be within the range from 1 to 3999.
     *
     * @param s
     * @return
     */
    public static int romanToInt(String s) {
        //�����ַ�
        int sum = 0;
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        for (int i = length - 1; i > -1; i--) {
            int m = getNum(s.charAt(i));
            sum = sum + m;
            if (i > 0) {
                int n = getNum(s.charAt(i - 1));
                if (n < m) {
                    sum = sum - 2 * n;
                }
            }
        }
        return sum;
    }

    private static int getNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
