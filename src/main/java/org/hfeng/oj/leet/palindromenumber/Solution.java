package org.hfeng.oj.leet.palindromenumber;
public class Solution {
    public boolean isPalindrome(int x){
        if (x < 0) {
            return false;
        }
        int tmp = x;
        int size = 1;
        while (tmp >= 10) {
            size *= 10;
            tmp = tmp / 10;
        }

        while (size >= 10) {
            int beg = x / size;
            int end = x % 10;
            if (beg != end) {
                return false;
            }
            x = x % size / 10;
            size /= 100;
        }
        return true;
    }
}
