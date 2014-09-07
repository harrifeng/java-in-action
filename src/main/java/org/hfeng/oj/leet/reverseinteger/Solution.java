package org.hfeng.oj.leet.reverseinteger;

public class Solution {
    public int reverse(int x) {
        int ret = 0;
        while (x != 0) {
            int num = x % 10;
            ret = ret * 10 + num;
            x = x / 10;
        }
        return ret;
    }
}
