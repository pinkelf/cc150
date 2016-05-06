package com.example.pack101to200;

/**
 * Created by majie on 16/2/15.
 */
public class BestTimetoBuyandSellStock {
    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * <p>
     * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        return getMax(prices, 0);
    }

    //find the highest. and the lowest in front of highest. max = Math.max(highest-lowest, ...);
    private static int getMax(int[] prices, int index) {
        if (index >= prices.length - 1) {
            return 0;
        }

        //avoid uneccessary recursion
        while (index < prices.length - 1) {
            if (prices[index] >= prices[index + 1]) {
                index++;
            } else {
                break;
            }
        }

        int high = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = index; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
                high = i;
            }
        }

        for (int i = index; i < high; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
        }
        int pre = 0;
        if (min != Integer.MAX_VALUE) {
            pre = max - min;
        }
        return Math.max(pre, getMax(prices, high + 1));
    }
}
