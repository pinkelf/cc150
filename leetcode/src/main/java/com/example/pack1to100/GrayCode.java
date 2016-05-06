package com.example.pack1to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/1/22.
 */
public class GrayCode {

    /**
     * The gray code is a binary numeral system where two successive values differ in only one bit.
     * <p>
     * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
     * <p>
     * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
     * <p>
     * 00 - 0
     * 01 - 1
     * 11 - 3
     * 10 - 2
     * Note:
     * For a given n, a gray code sequence is not uniquely defined.
     * <p>
     * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
     *
     * @param n
     * @return
     */
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        if (n == 0) {
            result.add(0);
            return result;
        }
        List<String> list = getCode(n);
        for (int i = 0; i < list.size(); i++) {
            int a = Integer.parseInt(list.get(i), 2);
            result.add(a);
        }
        return result;
    }

    //String is a very slow solution. update it for better performance
    //f(n) = ("0"+f(n-1), "1"+f(n-1))
    private static List<String> getCode(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 1) {
            list.add("0");
            list.add("1");
            return list;
        } else {
            List<String> result = getCode(n - 1);
            for (int i = 0; i < result.size(); i++) {
                String new1 = "0" + result.get(i);
                list.add(new1);
            }
            for (int i = result.size() - 1; i > -1; i--) {
                String new2 = "1" + result.get(i);
                list.add(new2);
            }
            return list;
        }
    }
}
