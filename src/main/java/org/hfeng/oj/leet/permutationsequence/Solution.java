package org.hfeng.oj.leet.permutationsequence;

public class Solution {
    private int getAcc(int n) {
        if (n <= 0) {
            return 0;
        }
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= i;
        }
        return ret;
    }
    public String getPermutation(int n, int k) {
        StringBuilder Num = new StringBuilder("123456789");
        StringBuilder sb = new StringBuilder();
        int accN = getAcc(n);
        k--;
        for (int i = n; i >= 1; i--) {
            accN /= i;
            int toDel = k / accN ;
            sb.append(Num.charAt(toDel));
            Num.deleteCharAt(toDel);
            k -= toDel * accN;
        }
        return sb.toString();
    }
}
