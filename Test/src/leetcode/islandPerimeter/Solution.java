package leetcode.islandPerimeter;

public class Solution {

    public int islandPerimeter(int[][] grid) {
        int res = 0;
        //расчёт верхних границ
        for (int i = 0; i < grid.length; i ++) {
            for (int y = 0; y < grid[i].length; y ++){
                if (i == 0){
                    if (grid[i][y] == 1) {
                        res ++;
                    }
                } else if (grid[i-1][y] == 0 && grid[i][y] == 1) {
                    res ++;
                }
            }
        }

        //расчёт нижних границ
        for (int i = 0; i < grid.length; i ++) {
            for (int y = 0; y < grid[i].length; y ++){
                if (i == grid.length - 1){
                    if (grid[i][y] == 1) {
                        res ++;
                    }
                } else if (grid[i+1][y] == 0 && grid[i][y] == 1) {
                    res ++;
                }
            }
        }

        //расчёт левых границ
        for (int i = 0; i < grid.length; i ++) {
            for (int y = 0; y < grid[i].length; y ++){
                if (y == 0){
                    if (grid[i][y] == 1) {
                        res ++;
                    }
                } else if (grid[i][y-1] == 0 && grid[i][y] == 1) {
                    res ++;
                }
            }
        }

        //расчёт правых границ
        for (int i = 0; i < grid.length; i ++) {
            for (int y = 0; y < grid[i].length; y ++){
                if (y == grid[i].length -1){
                    if (grid[i][y] == 1) {
                        res ++;
                    }
                } else if (grid[i][y+1] == 0 && grid[i][y] == 1) {
                    res ++;
                }
            }
        }
        return res;
    }
}
