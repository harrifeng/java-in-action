package org.hfeng.oj.leet.permutationsequence;
public class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder("123456789".substring(0, n));
        StringBuilder ret = new StringBuilder();

        int sum = factorial(n);

        for (int i = n; i >= 1; i--) {
            sum /= i;
            int d = (k - 1)/ sum;
            k = k - d * sum;
            ret.append(sb.charAt(d));
            sb.deleteCharAt(d);
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

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.factorial(1));
        System.out.println(s.factorial(2));
        System.out.println(s.factorial(3));
        System.out.println(s.factorial(4));
    }

}
