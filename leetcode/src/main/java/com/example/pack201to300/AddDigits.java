package com.example.pack201to300;

/**
 * Created by majie on 16/5/9.
 */
public class AddDigits {

    /**
     * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * <p/>
     * For example:
     * <p/>
     * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     * <p/>
     * Follow up:
     * Could you do it without any loop/recursion in O(1) runtime?
     * <p/>
     * Show Hint
     *
     * @param num
     * @return
     */
    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            if (num > 9) {
                num = num / 10;
            } else {
                num = -1;
            }
        }
        return addDigits(sum);
    }
}
