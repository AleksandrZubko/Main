package leetcode.сhallenge.maximumSubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int start = -1;
        int end = -1;



        for (int i = 1; i < nums.length; i ++) {
            if (start < 0 && nums[i] > 0) {
                start = nums[i];
            }
            if (start > 0) {

            }
        }

        return res;
    }
}
