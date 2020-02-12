package leetcode.findNUniqueIntegersSumUpToZero_1304;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = s.sumZero(5);
        for (int i:arr) {
            System.out.println(i);
        }
    }
}

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int tmp = 1;

            for (int i = 0; i <n/2; i ++) {
                res[i] = tmp;
                tmp ++;
            }
            for (int i = n/2; i <n; i ++) {
                tmp --;
                res[i] = tmp * -1;
            }
            if (n%2 != 0) {
                res[n - 1] = 0;
            }
        return res;
    }
}