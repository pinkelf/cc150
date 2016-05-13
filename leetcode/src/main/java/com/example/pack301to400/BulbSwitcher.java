package com.example.pack301to400;

/**
 * Created by majie on 16/5/11.
 */
public class BulbSwitcher {

    /**
     * There are n bulbs that are initially off. You first turn on all the bulbs. Then, you turn off every second bulb. On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb. Find how many bulbs are on after n rounds.
     * <p>
     * Example:
     * <p>
     * Given n = 3.
     * <p>
     * At first, the three bulbs are [off, off, off].
     * After first round, the three bulbs are [on, on, on].
     * After second round, the three bulbs are [on, off, on].
     * After third round, the three bulbs are [on, off, off].
     * <p>
     * So you should return 1, because there is only one bulb is on.
     *
     * @param n
     * @return
     */
    public static int bulbSwitch(int n) {
        //consider it as a math problem.
        //for 0<i<n, i is switched when i has a divider. dividers are in pairs. so i will always be off. (a*b=i,so a & b)
        //the only exception is that a^2 = i, so i is on.
        return (int) Math.sqrt(n);
    }

    /**
     * straight forward solution. will cause TLE
     *
     * @param n
     * @return
     */
    public int bulbSwitch2(int n) {
        boolean[] bulbs = new boolean[n + 1];

        for (int i = 1; i < n + 1; i++) {
            int count = 1;
            while (count * i < n + 1) {
                bulbs[count * i] = !bulbs[count * i];
                count++;
            }
        }

        int num = 0;
        for (int i = 1; i < n + 1; i++) {
            if (bulbs[i]) {
                num++;
            }
        }

        return num;
    }
}
