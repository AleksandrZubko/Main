package leetcode.countAndSay_38;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().countAndSay(3));

    }
}

class Solution {
    public String countAndSay(int n) {

        String[] arr = new String[n];
        arr[0] = "1";
        int cnt = 1;
        int lastVal = 0;
        String valTmp = "";
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listTmp = new ArrayList<>();
        list.add(1);
        if (n > 1) {
            for (int y = 1; y < n; y ++) {
                listTmp.clear();
                for (int i = 1; i < list.size()+1; i ++){

                    if(i < list.size()){
                        lastVal = list.get(i - 1);
                        if (lastVal == list.get(i)) {
                            cnt ++;
                        } else {
                            listTmp.add(cnt);
                            listTmp.add(list.get(i));
                            cnt = 1;
                        }
                    }else {
                        listTmp.add(cnt);
                        listTmp.add(list.get(0));
                        cnt = 1;
                    }

                }

                for (int r:listTmp
                     ) {
                    System.out.println(r);
                }

                list = listTmp;
                valTmp = "";
                for (int q:list) {
                    valTmp += q;
                }
                arr[n-1] = valTmp;
            }
        }
        return arr[n-1];
    }
}