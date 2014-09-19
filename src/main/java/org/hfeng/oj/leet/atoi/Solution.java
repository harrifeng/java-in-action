package org.hfeng.oj.leet.atoi;

public class Solution {
    public int atoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int start = 0;
        while (str.charAt(start) == ' ') {
            start++;
        }

        boolean negative = false;

        if (str.charAt(start) == '-') {
            negative = true;
            start++;
        } else if (str.charAt(start) == '+') {
            start++;
        }

        int ret = 0;
        for (int i = start; i < str.length(); i++) {
            // USEFUL HERE
            if (Character.isDigit(str.charAt(i))) {
                if (ret > Integer.MAX_VALUE / 10
                        || (ret == Integer.MAX_VALUE / 10
                        && Character.digit(str.charAt(i), 10) > Integer.MAX_VALUE % 10)) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                // USEFUL HERE
                ret = ret * 10 + Character.digit(str.charAt(i), 10);
            } else {
                break;
            }
        }
        return negative ? (-1) * ret : ret;
    }
}
