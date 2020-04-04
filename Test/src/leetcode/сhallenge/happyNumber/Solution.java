package leetcode.сhallenge.happyNumber;

import java.util.ArrayList;

public class Solution {
    public boolean isHappy(int n) {
        boolean res = false;
        if (n == 1) {
            res = true;
            return res;
        }

        ArrayList<Integer> list = intToList(n);

        int cnt = 0;
        int sum = 0;
        while (cnt < 100) {
            sum = sumOfPow(list);
            if (sum == 1) {
                res = true;
                break;
            } else {
                list = intToList(sum);
            }
            cnt ++;
        }
        return res;
    }
    ArrayList<Integer> intToList (int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = ("" + n).length();
        int p = 0;
        if (cnt > 1) {
            p = (int)Math.pow(10, cnt-1);
            while (p > 1) {
                list.add(n/p);
                n -= (n/p)*p;
                p = p/10;
            }
        }
        list.add(n);
        return list;
    }
    int sumOfPow (ArrayList<Integer> list) {
        int sum = 0;
        for (int i: list) {
            sum += (int)Math.pow(i,2);
        }
        return sum;
    }
}
