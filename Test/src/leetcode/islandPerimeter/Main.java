package leetcode.islandPerimeter;

public class Main {
    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        Solution s = new Solution();
        System.out.println(s.islandPerimeter(grid));


    }
}
