package org.hfeng.oj.leet.candy;
public class Solution {
    public int candy(int[] ratings) {
        if (ratings.length == 0) {
            return 0;
        }
        if (ratings.length == 1) {
            return 1;
        }
        int[] value = new int[ratings.length];
        for (int i = 1, inc = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                value[i] = Math.max(inc++, value[i]);
            } else {
                inc = 1;
            }
        }

        for (int i = ratings.length - 2, inc = 1; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]) {
                value[i] = Math.max(inc++, value[i]);
            } else {
                inc = 1;
            }
        }

        int ret = ratings.length;
        for (int i = 0; i < ratings.length; i++) {
            ret += value[i];
        }
        return ret;
    }
}
