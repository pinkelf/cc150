package com.example.pack1to100;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/4/16.
 */
public class MultiplyStrings {
    /**
     * Given two numbers represented as strings, return multiplication of the numbers as a string.
     * <p/>
     * Note:
     * The numbers can be arbitrarily large and are non-negative.
     * Converting the input string to integer is NOT allowed.
     * You should NOT use internal library such as BigInteger.
     *
     * @param num1
     * @param num2
     * @return
     */
    public static String multiply(String num1, String num2) {
        //follow human's behavior
        int[] int1 = new int[num1.length()];
        int[] int2 = new int[num2.length()];

        //convert string to int[]
        for (int i = 0; i < num1.length(); i++) {
            int1[i] = num1.charAt(num1.length() - 1 - i) - '0';
        }

        for (int i = 0; i < num2.length(); i++) {
            int2[i] = num2.charAt(num2.length() - 1 - i) - '0';
        }

        //compute each int arrays
        ArrayList<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < int2.length; i++) {
            int pre = 0;
            int[] temp = new int[int1.length + 1 + i];
            for (int j = 0; j < int1.length; j++) {
                int sum = int1[j] * int2[i] + pre;
                pre = sum / 10;
                temp[j + i] = sum % 10;
            }
            //don't forget add pre to head
            temp[temp.length - 1] = pre;

            list.add(temp);
        }

        int[] result = new int[num1.length() + num2.length()];
        int pre = 0;
        //add all int[]
        for (int i = 0; i < result.length; i++) {
            int sum = pre;
            for (int j = 0; j < list.size(); j++) {
                sum += i < list.get(j).length ? list.get(j)[i] : 0;
            }
            pre = sum / 10;
            result[i] = sum % 10;
        }

        StringBuffer buffer = new StringBuffer();
        boolean isBegin = false;
        //convert int[] to string
        for (int i = result.length - 1; i > -1; i--) {
            //take care with "0xxxx" strings
            if (result[i] != 0) {
                isBegin = true;
            }
            //take care with "00000" strings
            if (isBegin || i == 0) {
                buffer.append(result[i]);
            }
        }

        return buffer.toString();
    }
}
