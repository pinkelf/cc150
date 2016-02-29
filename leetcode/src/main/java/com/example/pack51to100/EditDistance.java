package com.example.pack51to100;

/**
 * Created by majie on 16/2/29.
 */
public class EditDistance {

    /**
     * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)
     * <p>
     * You have the following 3 operations permitted on a word:
     * <p>
     * a) Insert a character
     * b) Delete a character
     * c) Replace a character
     *
     * @param word1
     * @param word2
     * @return
     */
    public static int minDistance(String word1, String word2) {
        // https://en.wikipedia.org/wiki/Levenshtein_distance
        if (word1.length() == 0) {
            return word2.length();
        }
        if (word2.length() == 0) {
            return word1.length();
        }
        int[][] dis = new int[word1.length() + 1][word2.length() + 1];
        //init
        dis[0][0] = 0;
        for (int i = 1; i < word1.length() + 1; i++) {
            dis[i][0] = i;
        }
        for (int j = 1; j < word2.length() + 1; j++) {
            dis[0][j] = j;
        }

        //dp calculate
        for (int i = 0; i < word1.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                int d = word1.charAt(i) == word2.charAt(j) ? 0 : 1;
                dis[i + 1][j + 1] = Math.min(Math.min(dis[i][j + 1] + 1, dis[i + 1][j] + 1), dis[i][j] + d);
            }
        }

        return dis[word1.length()][word2.length()];
    }
}
