package leetcode.longestCommonPrefix_14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) { //пока strs[i] нечнётся не с prefix то
                prefix = prefix.substring(0, prefix.length() - 1);  //урезаем его на 1 символ
                if (prefix.isEmpty()) { //то же самое, что equals("")
                    return "";
                }
            }
        return prefix;
    }
}
