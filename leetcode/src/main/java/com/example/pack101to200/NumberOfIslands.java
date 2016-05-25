package com.example.pack101to200;

/**
 * Created by majie on 16/5/24.
 */
public class NumberOfIslands {

    /**
     * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
     * <p/>
     * Example 1:
     * <p/>
     * 11110
     * 11010
     * 11000
     * 00000
     * Answer: 1
     * <p/>
     * Example 2:
     * <p/>
     * 11000
     * 11000
     * 00100
     * 00011
     * Answer: 3
     *
     * @param grid
     * @return
     */
    public static int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }

        char c = 'a';
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    mark(i, j, grid, c);
                    c++;
                }
            }
        }

        return c - 'a';
    }

    private static void mark(int i, int j, char[][] grid, char c) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = c;

        mark(i + 1, j, grid, c);
        mark(i, j + 1, grid, c);
        mark(i, j - 1, grid, c);
        mark(i - 1, j, grid, c);
    }
}
