package leetcode.twoSum_1;

class Main{
    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;

        for (int i: new Solution().twoSum(nums, target)) {
            System.out.println(i);
        }

    }
}

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int y = i +1; y < nums.length; y++) {
                if (nums[i] + nums[y] == target){
                    res[0] = i;
                    res[1] = y;
                }
            }
        }
        return res;
    }
}




