package leetcode.lemonadeChange_860;

public class Main {
    public static void main(String[] args) {
        int[] input = {5,5,10,10,20};
        //int[] input = {10, 10};
        System.out.println(new Solution().lemonadeChange(input));
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        boolean res = false;
        int cash = 0;
        int surrender = 0;
        int[] numberOfBills = {0, 0, 0}; //{5$, 10$, 20$}
        int count5 = 0;
        int count10 = 0;
        int count20 = 0;

        for (int i = 0; i < bills.length; i++) {
            cash += bills[i];
            if (bills[i] == 5) {
                numberOfBills[0] += 1;
            } if (bills[i] == 10) {
                numberOfBills[1] += 1;
            } if (bills[i] == 20) {
                numberOfBills[2] += 1;
            }
            if (i > 0) {
                surrender = bills[i] - 5;
                if (surrender > 0) {
                    if (surrender <= cash) {
                       while (surrender > 0) {
                           count20 = surrender / 20;

                           if (count20 >= numberOfBills[2]) {
                               surrender = surrender - count20 * 20;
                               numberOfBills[2] = numberOfBills[2] - count20;
                           } else if (count20 > 0 && numberOfBills[2] > 0) {
                               surrender = surrender - numberOfBills[2] * 20;
                               numberOfBills[2] = 0;
                           }
                           count10 = surrender / 10;

                           if (count10 >= numberOfBills[1]) {
                               surrender = surrender - count10 * 10;
                               numberOfBills[1] = numberOfBills[1] - count10;
                           } else if (count10 > 0 && numberOfBills[1] > 0) {
                               surrender = surrender - numberOfBills[1] * 10;
                               numberOfBills[1] = 0;
                           }

                           count5 = surrender / 5;

                           if (count5 <= numberOfBills[0]) {
                               surrender = surrender - count5 * 5;
                               numberOfBills[0] = numberOfBills[0] - count5;
                           } else if (count5 > 0 && numberOfBills[0] > 0) {
                               surrender = surrender - count5 * 5;
                               numberOfBills[0] = 0;
                           }
                           if (surrender == 0) {
                               res = true;
                           } else {
                               res = false;
                               return res;
                           }
                           surrender = -1;
                       }

                    }
                }
            }
        }
    return res;
    }
}