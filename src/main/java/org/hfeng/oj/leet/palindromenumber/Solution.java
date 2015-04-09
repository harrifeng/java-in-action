package org.hfeng.oj.leet.palindromenumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int tmp = x;
        int count = 1;

        while (tmp >= 10) {
            count = count * 10;
            tmp = tmp / 10;
        }

        while (count >= 10) {
            int left = x / count;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = x % count / 10;
            count = count / 100;
        }
        return true;
    }
}
