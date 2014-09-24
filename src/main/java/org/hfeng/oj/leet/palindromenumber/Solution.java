package org.hfeng.oj.leet.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int tmp = x;
        int times = 1;
        while (tmp >= 10) {
            times *= 10;
            tmp /= 10;
        }

        // MISTAKE HERE
        // 009 can be only show 9, while times always has 1 at front
        while (times >= 10) {
            if (x / times != x % 10) {
                return false;
            }
            x  = x % times / 10;
            times /= 100;
        }
        return true;
    }
}
