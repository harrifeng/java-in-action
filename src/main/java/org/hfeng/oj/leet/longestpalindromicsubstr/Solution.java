package org.hfeng.oj.leet.longestpalindromicsubstr;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String ns = processString(s);
        int maxCenter = 0;
        int maxPos = 0;
        int[] count = new int[ns.length()];
        for (int i = 1; i < count.length - 1; i++) {
            int mirror = 2 * maxCenter - i;
            int startV = 0;
            if (i < maxPos) {
                startV = Math.min(maxPos - i, count[mirror]);
            }
            while (ns.charAt(i + startV) == ns.charAt(i - startV)) {
                startV++;
            }
            count[i] = startV - 1;
            if (count[i] + i > maxPos) {
                maxPos = count[i] + i;
                maxCenter = i;
            }
        }

        int target = 1;
        for (int i = 1; i < count.length -1; i++) {
            if (count[i] > count[target]) {
                target = i;
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = target - count[target]; i <= target + count[target]; i++) {
            if (ns.charAt(i) != '#') {
                ret.append(ns.charAt(i));
            }
        }
        return ret.toString();
    }

    public String processString(String s) {
        StringBuilder sb =  new StringBuilder("^#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        sb.append('$');
        return sb.toString();
    }
}
