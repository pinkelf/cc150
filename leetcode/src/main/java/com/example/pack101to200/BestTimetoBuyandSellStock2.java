package com.example.pack101to200;

/**
 * Created by majie on 16/2/15.
 */
public class BestTimetoBuyandSellStock2 {
    /**
     * Say you have an array for which the ith element is the price of a given stock on day i.
     * <p>
     * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
     * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int max = 0;
        if (prices.length < 2) {
            return max;
        }

        int index = 1;
        int left = Integer.MIN_VALUE;
        //begin, consider as smallest.
        if (prices[0] < prices[1]) {
            left = prices[0];
        }
        //mid, consider both smallest & biggest.
        while (index < prices.length - 1) {
            if (prices[index] >= prices[index + 1] && prices[index] >= prices[index - 1]) {
                if (left != Integer.MIN_VALUE) {
                    max = max + prices[index] - left;
                    left = Integer.MIN_VALUE;
                }
            } else if (prices[index] <= prices[index + 1] && prices[index] <= prices[index - 1]) {
                left = prices[index];
            }
            index++;
        }
        //end, consider as biggest.
        if (prices[index] > prices[index - 1]) {
            max = max + prices[index] - left;
        }

        return max;
    }
}
