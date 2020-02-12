package leetcode.maximum69Number_1323;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximum69Number(6996));

    }
}

class Solution {
    public static int maximum69Number(int num) {
        int numMod = num;
        int tmp = 0;
        for (int i = 0; i <= Integer.toString(numMod).length(); i++) {
            int koef = 1;
            for (int j = Integer.toString(num).length() - 1; j > 0; j--) {
                koef *= 10;
            }
            tmp = num/koef;
            if (tmp == 6) {
                numMod -= 6 * koef;
                numMod += 9 * koef;
                return numMod;
            } else {
                num -= 9 * koef;
            }
        }
        return numMod;
    }
}

/*
class Solution {
    public static int maximum69Number (int num) {
        String numToStr = Integer.toString(num);
        numToStr = numToStr.replaceFirst("6","9");
        return Integer.parseInt(numToStr);
    }
}
*/

/*
class Solution {
    public static int listToInt(ArrayList<Integer> digits){
        int num = 0;
        for (int i = 0; i < digits.size(); i++) {
            num += digits.get(i)*Math.pow(10,digits.size()-i-1);
        }
        return num;
    }
    public static int maximum69Number (int num) {
        ArrayList<Integer> digits = new ArrayList();
        while(num > 0){
            digits.add(0,num%10);
            num /= 10;
        }
        for (int i = 0; i < digits.size(); i++) {
            if(digits.get(i) == 6){
                digits.set(i,9);
                return listToInt(digits);
            }
        }
        return listToInt(digits);
    }
}
 */
