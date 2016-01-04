package com.example.pack51to100;

/**
 * Created by majie on 16/1/4.
 */
public class LengthOfLastWord {
    /**
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     * <p>
     * If the last word does not exist, return 0.
     * <p>
     * Note: A word is defined as a character sequence consists of non-space characters only.
     * <p>
     * For example,
     * Given s = "Hello World",
     * return 5.
     *
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }

        int i = 1;
        int j = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                j = i;
            }
            i++;
        }
        return i - j;
    }
}
