package leetcode.сhallenge.singleNumber;

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        if (nums.length == 1) {
            return res;
        }
        Arrays.sort(nums);
        int tmp = nums[0];
        int cnt = 1;
        for (int i = 1; i < nums.length; i ++) {
            if (tmp != nums[i] && cnt == 1) {
                res = tmp;
                return res;
            } else if (nums[nums.length-2] != nums[nums.length-1]){
                res = nums[nums.length-1];
                return res;
            } else if (tmp == nums[i]) {
                cnt ++;
            } else {
                tmp = nums[i];
                cnt = 1;
            }
        }
        return res;
    }
}
