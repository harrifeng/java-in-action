package org.hfeng.oj.leet.permutationsequence;
public class Solution {
    public String getPermutation(int n, int k) {
        k--;
        StringBuilder num = new StringBuilder("123456789");
        StringBuilder ret = new StringBuilder();

        int sum = getAcc(n);
        for (int i = n; i > 0; i--) {
            sum /= i;
            int current = k / sum;
            ret.append(num.charAt(current));
            num.deleteCharAt(current);
            k -= current * sum;
        }
        return ret.toString();
    }
    private int getAcc(int n) {
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
}
