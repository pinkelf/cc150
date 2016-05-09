package com.example.pack301to400;

/**
 * Created by majie on 16/5/6.
 */
public class ReverseVowelsofaString {

    /**
     * Write a function that takes a string as input and reverse only the vowels of a string.
     * <p/>
     * Example 1:
     * Given s = "hello", return "holle".
     * <p/>
     * Example 2:
     * Given s = "leetcode", return "leotcede".
     *
     * @param s
     * @return
     */
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            while (!isVowel(chars[low])) {
                low++;
                if (low == s.length()) {
                    break;
                }
            }
            while (!isVowel(chars[high])) {
                high--;
                if (high == -1) {
                    break;
                }
            }
            if (low > high) {
                break;
            }

            char c = chars[low];
            chars[low] = chars[high];
            chars[high] = c;
            low++;
            high--;
        }

        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
