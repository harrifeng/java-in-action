package org.hfeng.oj.leet.palindromenumber;
public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        // x is bigger than 9 here
        int tmp = x;
        int size = 1;
        while (tmp >= 10) {
            size *= 10;
            tmp /= 10;
        }
        while (size >= 10) {
            if ( x % 10 != x / size) {
                return false;
            }
            x = x % size / 10;
            size = size / 100;
        }
        return true;
    }
}
