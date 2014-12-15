package org.hfeng.oj.leet.atoi;
public class Solution {
    public int atoi(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int beg = 0;
        while (str.charAt(beg) == ' ') {
            beg++;
        }
        boolean neg = false;
        if (str.charAt(beg) == '+') {
            beg++;
        } else if (str.charAt(beg) == '-') {
            beg++;
            neg = true;
        }

        int ret = 0;
        for (int i = beg; i < str.length(); i++) {
            char now = str.charAt(i);
            if (Character.isDigit(now)) {
                if (ret > Integer.MAX_VALUE / 10
                    || (ret == Integer.MAX_VALUE / 10 && now - '0' > Integer.MAX_VALUE % 10)) {
                    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                ret = ret * 10 + (now - '0');
            } else {
                break;
            }
        }
        return neg ? (-1) * ret : ret;
    }
}
