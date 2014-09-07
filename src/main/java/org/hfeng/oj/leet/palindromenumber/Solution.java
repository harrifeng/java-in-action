package org.hfeng.oj.leet.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int size = 1;
        int tmp = x;
        while (tmp >= 10) {
            tmp = tmp / 10;
            size = size * 10;
        }

        while (size >= 10) {
            if (x / size != x % 10) {
                return false;
            }
            x = x % size / 10;
            size = size / 100;
        }
        return true;
    }
}
