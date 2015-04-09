package org.hfeng.oj.leet.climbingstairs;
class Solution{
    public int climbStairs(int n) {
        return fab(n);
    }

    private int fab(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        // return fab(n-1) + fab(n-2);
        for (int i = 3; i <= n; i++) {
            int tmp = f1;
            f1 = f2;
            f2 = tmp + f2;
        }
        return f2;
    }
}
