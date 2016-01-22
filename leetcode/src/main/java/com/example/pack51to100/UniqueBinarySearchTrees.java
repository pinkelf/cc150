package com.example.pack51to100;

/**
 * Created by majie on 16/1/22.
 */
public class UniqueBinarySearchTrees {
    /**
     * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
     * <p>
     * For example,
     * Given n = 3, there are a total of 5 unique BST's.
     * <p>
     * 1        3     3      2      1
     * \       /     /      / \      \
     * 3     2     1      1   3      2
     * /     /       \                 \
     * 2    1         2                 3
     *
     * @param n
     * @return
     */

    public static int numTrees(int n) {
        //n[5] = n[4](left) + n[4](right) + (n[1]*n[3]+n[2]*n[2]+n[3]*n[1])(both left & right)
        if (n == 1) {
            return 1;
        }
        int[] count = new int[n + 1];
        count[0] = 0;
        count[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                sum = sum + count[j] * count[i - j - 1];
            }
            count[i] = 2 * count[i - 1] + sum;
        }
        return count[n];
    }
}
