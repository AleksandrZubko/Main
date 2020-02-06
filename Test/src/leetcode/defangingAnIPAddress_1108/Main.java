package leetcode.defangingAnIPAddress_1108;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String ip = "1.1.1.1";

        System.out.println(s.defangIPaddr(ip));
    }
}
class Solution {
    public String defangIPaddr(String address) {
        /* решается в одну строчку
        String res = "";
        int point = 0;
        for (int i = 0; i <= 4; i ++) {
            point = address.indexOf(".");
                if (point != -1) {
                    res += address.substring(0, point) + "[.]";
                    address = address.substring(point+1);
                } else {
                    res += address;
                    break;
                }
            }
        return res;
        */
        return address.replace(".","[.]");
    }
}
