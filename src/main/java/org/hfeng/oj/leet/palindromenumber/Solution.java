package org.hfeng.oj.leet.palindromenumber;
public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }

        int size = 1;
        int tmp = x;
        while (tmp >= 10) {
            size *= 10;
            tmp = tmp / 10;
        }

        while (size >= 10) {
            if (x % 10 != x / size ) {
                return false;
            }
            x = x % size / 10;
            size /= 100;
        }
        return true;
    }
}
