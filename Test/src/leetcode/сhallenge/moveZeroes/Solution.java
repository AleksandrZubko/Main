package leetcode.сhallenge.moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        for (int f = 0; f < 2; f++) {
            int indexZero = nums.length-1;
            int tmp = 0;
            for (int i = nums.length-1; i >-1; i --) {
                if (nums[i] == 0) {
                    indexZero = i;
                } if (nums[i] != 0) {
                    break;
                }
            }
            for (int i = 0;  i < nums.length && i < indexZero; i ++) {
                if (nums[i] == 0) {
                    for (int j = i; j < indexZero+1; j++) {
                        if (j < nums.length-1) {
                            nums[j] = nums[j + 1];
                        }
                    }
                    nums[indexZero] = 0;
                    indexZero --;
                }
            }
        }
    }
}
