package org.hfeng.oj.leet.atoi;
public class Solution {
    public int atoi(String str) {
        if (str.length() == 0 || str == null) {
            return 0;
        }
        int start = 0;
        while (str.charAt(start) == ' ') {
            start++;
        }
        boolean neg = false;
        if (str.charAt(start) == '-') {
            neg = true;
            start++;
        } else if (str.charAt(start) == '+') {
            neg = false;
            start++;
        }
        int ret = 0;

        for (int i = start; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int cur = Character.digit(str.charAt(i), 10);
                if (ret > Integer.MAX_VALUE / 10
                    || (ret == Integer.MAX_VALUE / 10
                        && cur > Integer.MAX_VALUE % 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else {
                    ret = ret * 10 + cur;
                }
            } else {
                break;
            }
        }
        return neg ? (-1) * ret : ret;
    }
}
