package leetcode.selfDividingNumbers_728;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        for (Integer i:s.selfDividingNumbers(23, 23)) {
            System.out.print(i + ", ");
        }
    }
}

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int capacity = 0;
        int remainder = 100;
        for (int i = left; i <= right; i ++) {
            int tmp = i;
            int tmp2 = i;
            while (remainder > 0) {
                remainder = tmp2/10;
                if (remainder > 0) {
                    capacity ++;
                }
                tmp2 -= remainder*10;
            }

            for (int y = capacity+1; y >= 1; y --) {
                if (y > 0){
                    int t = (int)Math.pow(10, capacity);
                    arr.add(tmp/t);
                    tmp -= t;
                } else {
                    arr.add(tmp);
                }
            }

            capacity = 0;

            

        }
        return res;
    }
}
