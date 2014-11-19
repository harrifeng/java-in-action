package org.hfeng.oj.leet.atoi;
public class Solution {
    public int atoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int start = 0;
        boolean neg = false;
        while (str.charAt(start) == ' ') {
            start++;
        }
        if (str.charAt(start) == '-') {
            neg = true;
            start++;
        } else if (str.charAt(start) == '+') {
            start++;
        }

        int ret = 0;
        for (int i = start; i < str.length(); i++) {
            char current = str.charAt(i);
            if (Character.isDigit(current)) {
                if (ret > Integer.MAX_VALUE / 10
                    || (ret == Integer.MAX_VALUE / 10
                        && (current - '0') > Integer.MAX_VALUE % 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ret = ret * 10 + (current - '0');
            }
        }
        return neg ? (-1) * ret : ret;
    }
}
