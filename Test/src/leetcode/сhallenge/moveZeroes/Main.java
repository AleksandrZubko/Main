package leetcode.сhallenge.moveZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {0,1,0,3,12};
        //int[] arr = {0,0,1};
        //int[] arr = {0,1, 0, 0,0,1,2};
        s.moveZeroes(arr);

        for (Integer i:arr) {
            System.out.println(i);
        }
    }
}
