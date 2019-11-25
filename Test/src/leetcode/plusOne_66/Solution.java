package leetcode.plusOne_66;

import java.util.ArrayList;

public class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int remain = 0, t = 0;
        for (int i = digits.length - 1; i >= 0; i --) {
            if (i == digits.length - 1) {
                t = digits[i] + 1;
            } else {
                t = digits[i] + remain;
            }
            remain = (t - t%10)/10;
            list.add(t%10);
        }
        if (remain > 0) {
            list.add(remain);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i ++) {
            res[res.length -1 - i] = list.get(i);
        }
        return res;
    }
}
