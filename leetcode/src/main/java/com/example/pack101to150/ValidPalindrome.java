package com.example.pack101to150;

/**
 * Created by majie on 16/2/18.
 */
public class ValidPalindrome {
    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * <p>
     * For example,
     * "A man, a plan, a canal: Panama" is a palindrome.
     * "race a car" is not a palindrome.
     * <p>
     * Note:
     * Have you consider that the string might be empty? This is a good question to ask during an interview.
     * <p>
     * For the purpose of this problem, we define empty string as valid palindrome.
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        String string = s.trim().toLowerCase();
        for (int i = 0, j = string.length() - 1; i < j; ) {
            while (i < string.length() && !isChar(string.charAt(i))) {
                i++;
            }
            while (j > -1 && !isChar(string.charAt(j))) {
                j--;
            }
            if (i > j) {
                break;
            }
            if (string.charAt(i) == string.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isChar(char c) {
        boolean isCha = c >= 'a' && c <= 'z';
        boolean isNum = c >= '0' && c <= '9';
        return isCha || isNum;
    }
}
