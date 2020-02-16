package leetcode.findAllDuplicatesInAnArray_442;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Solution s = new Solution();
        for (Integer i: s.findDuplicates(nums)) {
            System.out.print(i + ", ");
        }
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i: nums) {
            list.add(i);
        }
        ArrayList<Integer> doublicate = new ArrayList<>();
        int tmp = 0;
        if (nums.length > 0) {
            tmp = list.get(0);
        } else {
            return list;
        }

        for (int i = 1; i < list.size(); i ++) {
            if(tmp == list.get(i)) {
                if (doublicate.size()>0) {
                    if(doublicate.get(0) != tmp) {
                        doublicate.add(0, tmp);
                    }
                } else {
                    doublicate.add(0, tmp);
                }
                list.remove(i);
                i --;
            } else {
                tmp = list.get(i);
            }
        }
        return doublicate;
    }
}
