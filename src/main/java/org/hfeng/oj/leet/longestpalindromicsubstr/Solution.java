package org.hfeng.oj.leet.longestpalindromicsubstr;

import java.lang.StringBuilder;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        String ns = convert(s);
        int[] range = new int[ns.length()];

        int maxIndex = 0;
        int maxPos = 0;

        for (int i = 1; i < ns.length() - 1; i++) {
            int mirror = 2 * maxIndex - i;
            // MISTAKE HERE
            int startV = (maxPos > i) ? Math.min(maxPos - i, range[mirror]) : 0;

            while (ns.charAt(i - startV) == ns.charAt(i + startV)) {
                startV++;
            }
            range[i] = startV;

            if (startV > maxPos) {
                maxPos = startV;
                maxIndex = i;
            }
        }

        int target = 0;
        for (int i = 1; i < ns.length() - 1; i++) {
            if (range[i] > range[target]) {
                target = i;
            }
        }

        StringBuilder ret = new StringBuilder();
        // MISTAKE HERE
        for (int i = target - range[target] + 1; i < target + range[target]; i++) {
            char c = ns.charAt(i);
            if (c != '^' && c != '#' && c != '$') {
                ret.append(c);
            }
        }
        return ret.toString();
    }

    private String convert(String str) {
        StringBuilder sb = new StringBuilder("^#");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append("#");
        }
        sb.append("$");
        return sb.toString();
    }
}
