package leetcode.findNumbersWithEvenNumberOfDigits_1295;

public class Main {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(new Solution().findNumbers(nums));
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int i: nums) {
            if (("" + i).length()%2 == 0) {
                res ++;
            }
        }
        return res;
    }
}