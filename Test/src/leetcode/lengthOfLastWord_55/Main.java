package leetcode.lengthOfLastWord_55;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLastWord("    "));

    }
}

class Solution {
    public int lengthOfLastWord(String s) {
            String[] arr = s.split(" ");
            if (arr.length > 0) {
                return arr[arr.length-1].length();
            } else {
                return 0;
            }
    }
}