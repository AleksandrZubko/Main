package leetcode.validParentheses_20;

public class Main {
    public static void main(String[] args) {
        String param = "(()(";
        param = "()[]{}";
        param = "()[]";

        Solution s = new Solution();
        System.out.println(s.isValid(param));
    }
}
