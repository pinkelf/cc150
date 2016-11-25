package com.example.package401to500;

/**
 * Created by majie on 16/11/25.
 */

public class IslandPerimeter {
    public static int count = 0;

    /**
     * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
     * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island
     * (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
     * One cell is a square with side length
     * 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
     * <p>
     * [[0,1,0,0],
     * [1,1,1,0],
     * [0,1,0,0],
     * [1,1,0,0]]
     * <p>
     * Answer: 16
     *
     * @param grid
     * @return
     */
    public static int islandPerimeter(int[][] grid) {
        count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    visit(i, j, grid);
                }
            }
        }
        return count;
    }

    public static void visit(int i, int j, int[][] grid) {
        grid[i][j] = 2;
        int top = i > 0 ? grid[i - 1][j] : 0;
        int left = j > 0 ? grid[i][j - 1] : 0;
        int right = j + 1 < grid[0].length ? grid[i][j + 1] : 0;
        int bottom = i + 1 < grid.length ? grid[i + 1][j] : 0;
        if (top == 0) {
            count++;
        }
        if (left == 0) {
            count++;
        }
        if (right == 0) {
            count++;
        }
        if (bottom == 0) {
            count++;
        }
        if (top == 1) {
            visit(i - 1, j, grid);
        }
        if (left == 1) {
            visit(i, j - 1, grid);
        }
        if (right == 1) {
            visit(i, j + 1, grid);
        }
        if (bottom == 1) {
            visit(i + 1, j, grid);
        }

    }
}
