package leetcode.minimumAbsoluteDifference_1200;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        //int[] arr = {1, 3, 6, 10, 15};
        List<List<Integer>> res = new Solution().minimumAbsDifference(arr);

    }
}

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        int[] arrNew = arr;
        Arrays.sort(arrNew);
        int minDifference = Integer.MAX_VALUE;
        int tmpDifference = 0;

        for (int i = 0; i < arrNew.length - 1; i ++) {
            tmpDifference = Math.abs(arrNew[i] - arrNew[i+1]);
            if (tmpDifference < minDifference) {
                minDifference = tmpDifference;
                res.clear();
            }
            if(tmpDifference == minDifference) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arrNew[i]);
                temp.add(arrNew[i+1]);
                res.add(temp);
            }
        }
        return res;
    }
}