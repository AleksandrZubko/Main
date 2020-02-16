package leetcode.moveZeroes_283;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0,1,0,3,12};
        s.moveZeroes(nums);
        for (Integer i:nums) {
            System.out.print(i + ", ");
        }
    }
}

/*
class Solution {
    public void moveZeroes(int[] nums) {
        int tmp = 0;
        for (int y = 0; y < nums.length; y ++) {
            for (int i = 0; i < nums.length - 1-y; i++) {
                if (nums[i] == 0) {
                    tmp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = tmp;
                }
            }
        }

    }
}
*/


class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i: nums) {
            if (i != 0) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        for (int i = list.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
