package leetcode.plusOne_66;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] arr = {9,8,7, 6, 5, 4, 3, 2, 1, 0};
        int[]  arr = {9};
        for (int i:new Solution().plusOne(arr)) {
            System.out.println(i);
        }
    }
}
