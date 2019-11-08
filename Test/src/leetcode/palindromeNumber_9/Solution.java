package leetcode.palindromeNumber_9;

public class Solution {
    public boolean isPalindrome(int x) {
        boolean res = false;
        String strX = "" + x;
        String  reverse = new StringBuilder().append(strX).reverse().toString();
        if (strX.equals(reverse)) {
            res = true;
        }
        return res;
    }
}
