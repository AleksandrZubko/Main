package leetcode.implementStrStr_28;

public class Main {
    public static void main(String[] args) {
        //String haystack = "hello", needle = "ll";
        //String haystack = "aaa", needle = "a";
        String haystack = "mississippi", needle = "pi";

        System.out.println(new Solution().strStr(haystack, needle));
    }
}
