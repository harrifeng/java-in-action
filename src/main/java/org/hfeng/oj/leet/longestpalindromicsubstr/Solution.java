package org.hfeng.oj.leet.longestpalindromicsubstr;

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return "";
        }
        String processStr = handleStr(s);

        int[] value = new int[processStr.length()];

        int maxIndex = 0;
        int maxPos = 0;
        for (int i = 1; i < value.length - 1; i++) {
            int startSize = 0;
            if (i < maxPos) {
                int mirrorIndex = 2 * maxIndex - i;
                startSize = Math.min(value[mirrorIndex], maxPos - i);
            }
            while (processStr.charAt(i + startSize + 1) == processStr.charAt(i - startSize - 1)) {
                startSize++;
            }

            value[i] = startSize;
            if (startSize + i > maxPos) {
                maxPos = startSize + i;
                maxIndex = i;
            }
        }

        int maxV = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] > value[maxV]) {
                maxV = i;
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = maxV - value[maxV]; i <= maxV + value[maxV]; i++) {
            char now = processStr.charAt(i);

            if (now != '^' && now != '$' && now != '#') {
                ret.append(now);
            }
        }
        return ret.toString();
    }

    private String handleStr(String s) {
        StringBuilder sb = new StringBuilder("^#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        sb.append('$');
        return sb.toString();
    }
}
