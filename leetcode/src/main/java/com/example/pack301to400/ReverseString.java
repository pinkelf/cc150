package com.example.pack301to400;

/**
 * Created by majie on 16/5/6.
 */
public class ReverseString {
    /**
     * Write a function that takes a string as input and returns the string reversed.
     * <p/>
     * Example:
     * Given s = "hello", return "olleh".
     *
     * @param s
     * @return
     */
    public static String reverseString(String s) {
        char[] string = s.toCharArray();
        int i = 0;
        int j = string.length - 1;
        while (i < j) {
            char temp = string[i];
            string[i] = string[j];
            string[j] = temp;
            i++;
            j--;
        }

        return String.copyValueOf(string);
    }
}
