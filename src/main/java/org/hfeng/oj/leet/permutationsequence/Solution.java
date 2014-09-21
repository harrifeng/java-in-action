package org.hfeng.oj.leet.permutationsequence;

import java.util.Arrays;

public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder input = new StringBuilder("123456789".substring(0, n));
        //StringBuilder ret = new StringBuilder();
        char[] tmp = new char[input.length()];
        Arrays.fill(tmp, ' ');
        String ret2 = new String(tmp);
        StringBuilder ret = new StringBuilder(ret2);

        int total = factorial(n);
        for (int i = 0; i < n; i++) {
            total /= (n - i);
            int index = (k - 1) / total;
            ret.setCharAt(i, input.charAt(index));
            input.deleteCharAt(index);
            k -= index * total;
        }
        return ret.toString();
    }

    private int factorial(int n) {
        int ret = 1;
        for (int i = 2; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
}
