package leetcode.subtractTheProductAndSumOfDigitsOfAnInteger_1281;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.subtractProductAndSum(4421));
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        String nS = "" + n;
        BigInteger prod = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 0; i < nS.length(); i ++) {
            prod = prod.multiply(BigInteger.valueOf(Integer.parseInt(nS.substring(i, i + 1))));
            sum = sum.add(BigInteger.valueOf(Integer.parseInt(nS.substring(i, i + 1))));
        }

        return prod.subtract(sum).intValue();
    }
}