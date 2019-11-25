package leetcode.implementStrStr_28;

public class Solution {
    public int strStr(String haystack, String needle) {
        int res = 0;
        if (needle == "") {
            return res;
        } else if (haystack.indexOf(needle) == -1) {
            res = -1;
        } else {
            for (int i = 0; i <= haystack.length()-needle.length(); i ++) {
                if (haystack.substring(i, needle.length()+i).equals(needle)) {
                    res = i;
                    return res;
                }
            }
        }
        return res;
    }
}
