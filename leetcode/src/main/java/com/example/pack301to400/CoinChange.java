package com.example.pack301to400;

/**
 * Created by majie on 16/5/9.
 */
public class CoinChange {
    /**
     * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
     * <p/>
     * Example 1:
     * coins = [1, 2, 5], amount = 11
     * return 3 (11 = 5 + 5 + 1)
     * <p/>
     * Example 2:
     * coins = [2], amount = 3
     * return -1.
     * <p/>
     * Note:
     * You may assume that you have an infinite number of each kind of coin.
     *
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dis = new int[amount + 1];
        for (int i = 1; i < amount + 1; i++) {
            int d = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i > coins[j]) {
                    int count = dis[i - coins[j]];
                    if (count != Integer.MAX_VALUE) {
                        d = Math.min(count + 1, d);
                    }
                } else if (i == coins[j]) {
                    d = 1;
                    break;
                }
            }
            dis[i] = d;
        }

        return dis[amount] == Integer.MAX_VALUE ? -1 : dis[amount];
    }
}
