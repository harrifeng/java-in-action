package org.hfeng.oj.leet.climbingstairs;

//////////////////////////////////////////////////////////
// f(n) stands for the ways to climbing n steps         //
// In order to reach f(n), you have following two ways: //
// + One step from f(n-1);                              //
// + Two step from f(n-2);                              //
// Thus, f(n) = f(n-1) + f(n-2). ==> Fabonacci          //
//////////////////////////////////////////////////////////
class Solution {
    public int climbStairs(int n) {
        // The definitation for fabonacci's first
        // element is number 0th : 0
        int prev = 0;
        int curr = 1;

        if (n == 0) {
            return prev;
        }
        for (int i = 1; i <= n; i++) {
            int tmp = curr;
            curr += prev;
            prev = tmp;
        }
        return curr;
    }
}
