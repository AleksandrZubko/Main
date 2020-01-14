package leetcode.lemonadeChange_860;

public class Main {
    public static void main(String[] args) {
        //int[] input = {5,5,10,10,20};
        //int[] input = {10, 10};
        //int[] input = {5, 5, 5, 10, 20};
        int[] input = {5, 5, 10};
        System.out.println(new Solution().lemonadeChange(input));
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean res = false;
        int count5 = 0;
        int count10 = 0;
        int nextBill = 0;
        int surrender = 0;

        for (int i = 0; i < bills.length - 1; i++) {
            switch (bills[i]) {
                case 5:
                    count5 ++;
                    break;
                case 10:
                    count10 ++;
                    break;
            }
            nextBill = bills[i+1];
            surrender = nextBill - 5;
            if (surrender == 0) {
                res = true;
            } else {
                if (surrender == 5) {
                    if (count5 > 0) {
                        count5 --;
                    } else {
                        return false;
                    }
                } else if (surrender == 15) {
                    if (count10 > 0 && count5 > 0) {
                        count10 --;
                        count5 --;
                    } else if (count5 >= 3) {
                        count5 = count5 - 3;
                    } else {
                        return false;
                    }
                }
            }
        }
        return res;
    }
}