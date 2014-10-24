package org.hfeng.oj.leet.permutationsequence;
public class Solution {
    private static final String NUM= "123456789";
    public String getPermutation(int n, int k) {
        if (n == 1) {
            return "1";
        }
        StringBuilder ret = new StringBuilder();
        StringBuilder start = new StringBuilder(NUM.substring(0, n));
        for (int i = n; i >= 1; i--) {
            // Be careful here, you should use i, other than n
            // in the loop!!
            int target = (k - 1) / factorial(i - 1);
            k -= target * factorial(i - 1);
            ret.append(start.charAt(target));
            start.deleteCharAt(target);
        }
        return ret.toString();
    }
    private int factorial(int num) {
        int sum = 1;
        for (int i = 2; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}
