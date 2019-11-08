package leetcode.reverseInteger;

import java.math.BigInteger;

public class Solution {
    public int reverse(int x) {

        int res = 0;
        boolean minus = false;
        String tmpStr = "" + x;
        if (tmpStr.contains("-")) {
            minus = true;
            tmpStr = tmpStr.substring(1, tmpStr.length());
        }

        StringBuilder sb = new StringBuilder();
        sb.append(tmpStr);
        tmpStr = sb.reverse().toString();
        sb.delete(0, sb.length());    // очистка StringBuilder
        BigInteger bigX = new BigInteger(tmpStr);
        if (bigX.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) > 0 && bigX.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) < 0) {
            if (minus) {
                bigX = bigX.multiply(BigInteger.valueOf(-1));
            }
            res = bigX.intValue();
        }

        return res;
    }
}
