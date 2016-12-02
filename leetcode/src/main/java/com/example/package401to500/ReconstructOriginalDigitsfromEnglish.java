package com.example.package401to500;

/**
 * Created by majie on 16/12/2.
 */

public class ReconstructOriginalDigitsfromEnglish {
    /**
     * Given a non-empty string containing an out-of-order English representation of digits 0-9, output the digits in ascending order.
     * <p>
     * Note:
     * Input contains only lowercase English letters.
     * Input is guaranteed to be valid and can be transformed to its original digits. That means invalid inputs such as "abc" or "zerone" are not permitted.
     * Input length is less than 50,000.
     * Example 1:
     * Input: "owoztneoer"
     * <p>
     * Output: "012"
     *
     * @param s
     * @return
     */
    public static String originalDigits(String s) {
        //zero,one,two,three,four,five,six,seven,eight,nine is hardcoded.
        //a common solution is recursive find string which contains unique character.
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        int[] digits = new int[10];
        // solve unique char
        // 0
        digits[0] = chars['z' - 'a'];
        remove(chars, digits[0], "zero");
        // 2
        digits[2] = chars['w' - 'a'];
        remove(chars, digits[2], "two");
        // 6
        digits[6] = chars['x' - 'a'];
        remove(chars, digits[6], "six");
        // 8
        digits[8] = chars['g' - 'a'];
        remove(chars, digits[8], "eight");
        // solve multi chars
        // 7
        digits[7] = chars['s' - 'a'];
        remove(chars, digits[7], "seven");
        // 3
        digits[3] = chars['t' - 'a'];
        remove(chars, digits[3], "three");
        // 4
        digits[4] = chars['r' - 'a'];
        remove(chars, digits[4], "four");
        // 5
        digits[5] = chars['f' - 'a'];
        remove(chars, digits[5], "five");
        // 1
        digits[1] = chars['o' - 'a'];
        remove(chars, digits[1], "one");
        // 9
        digits[9] = chars['i' - 'a'];
        remove(chars, digits[9], "nine");

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < digits.length; i++) {
            while (digits[i] > 0) {
                buffer.append(i);
                digits[i]--;
            }
        }

        return buffer.toString();
    }

    private static void remove(int[] chars, int count, String num) {
        for (int i = 0; i < num.length(); i++) {
            chars[num.charAt(i) - 'a'] -= count;
        }
    }
}
