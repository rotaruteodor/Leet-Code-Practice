// https://leetcode.com/problems/longest-common-prefix/

import java.util.Arrays;

public class LongestCommonPrefix {
    static public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];
        int i = 0;
        while (i < firstString.length() && i < lastString.length()) {
            if (firstString.charAt(i) == lastString.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return firstString.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"abcd", "abcdsf", "abbg"};
        System.out.println(longestCommonPrefix(strs));
    }
}
