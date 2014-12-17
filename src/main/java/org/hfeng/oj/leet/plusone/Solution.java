package org.hfeng.oj.leet.plusone;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        // only plus one, so only 9999 need extra
        // array, and the new array value will always
        // be 10000
        int[] ret = new int[digits.length+1];
        ret[0] = 1;
        return ret;
    }
}
