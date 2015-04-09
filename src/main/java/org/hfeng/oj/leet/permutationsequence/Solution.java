package org.hfeng.oj.leet.permutationsequence;
public class Solution {
    public String getPermutation(int n, int k) {
        if (n == 1) {
            return "1";
        }
        StringBuilder all = new StringBuilder("123456789");
        int factN = factorial(n);
        StringBuilder ret = new StringBuilder();

        k = k - 1;
        for (int i = n; i >= 1; i--) {
            factN = factN / i;
            int pos = k / factN;
            k = k - pos * factN;
            ret.append(all.charAt(pos));
            all.deleteCharAt(pos);
        }
        return ret.toString();
    }

    private int factorial(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
}
