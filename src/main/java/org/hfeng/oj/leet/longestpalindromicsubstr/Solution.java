package org.hfeng.oj.leet.longestpalindromicsubstr;
public class Solution {
    public String longestPalindrome(String s) {
        // process nstr all the time
        String nstr = process(s);
        int len = nstr.length();

        int[] index = new int[len];
        int mostInd = 0;
        int mostPos = 0;
        // 0 is ^, len - 1 is $
        for (int i = 1; i < len-1; i++) {
            int start = 0;
            if (i < mostPos) {
                int mirror = 2 * mostInd - mostPos;
                start = Math.min(index[mirror], mostPos - i);
            }
            // while (index[i + start] == index[i - start]) {
            while (nstr.charAt(i + start) == nstr.charAt(i - start)) {
                // at least 1 now
                start++;
            }
            index[i] = start - 1;
            if (i + index[i] > mostPos) {
                mostPos = i + index[i];
                mostInd = i;
            }
        }

        //have index[] all ready now
        int max = 0;
        for (int i = 1; i < len - 1; i++) {
            if (index[i] > index[max]) {
                max = i;
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = max - index[max] ; i <= max + index[max]; i++) {
            if (nstr.charAt(i) != '^' && nstr.charAt(i) != '$'
                && nstr.charAt(i) != '#') {
                ret.append(nstr.charAt(i));
            }
        }
        return ret.toString();
    }
    private String process(String str) {
        StringBuilder sb = new StringBuilder("^#");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append('#');
        }
        sb.append('$');
        return sb.toString();
    }
}
