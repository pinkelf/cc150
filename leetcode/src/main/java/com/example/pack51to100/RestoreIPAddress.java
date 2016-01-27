package com.example.pack51to100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by majie on 16/1/27.
 */
public class RestoreIPAddress {
    /**
     * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
     * <p>
     * For example:
     * Given "25525511135",
     * <p>
     * return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)
     *
     * @param s
     * @return
     */
    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        getIP(s, 4, "", result);
        return result;
    }

    //consider ip address as a 4-digits combine.
    private static void getIP(String string, int digits, String prefix, List<String> result) {
        //string too long or too short
        if (string.length() > digits * 3 || digits > string.length()) {
            return;
        } else if (digits == 1) {
            //only 1 digit
            int num = Integer.valueOf(string);
            //ignore string '0?*'
            if (string.length() > 1 && string.charAt(0) == '0') {
                return;
            }
            //ignore string > 255
            if (num <= 255) {
                String target = prefix + string;
                if (!result.contains(target)) {
                    result.add(target);
                }
            }
        } else if (string.charAt(0) == '0') {
            //special case '0'
            getIP(string.substring(1, string.length()), digits - 1, prefix + "0" + ".", result);
        } else {
            int length = string.length();
            if (length > 0) {
                //1+f(n-1)
                getIP(string.substring(1, string.length()), digits - 1, prefix + string.substring(0, 1) + ".", result);
            }
            if (length > 1) {
                //2+f(n-2)
                getIP(string.substring(2, string.length()), digits - 1, prefix + string.substring(0, 2) + ".", result);
            }
            if (length > 2) {
                //3+f(n-3)
                String pre = string.substring(0, 3);
                if (Integer.valueOf(pre) <= 255) {
                    getIP(string.substring(3, string.length()), digits - 1, prefix + pre + ".", result);
                }
            }
        }
    }
}
