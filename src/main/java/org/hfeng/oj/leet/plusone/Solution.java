package org.hfeng.oj.leet.plusone;

import java.util.*;

public class Solution {
    public int[] plusOne(int[] digits) {
        int pos = digits.length - 1;
        while (pos >= 0) {
            if (digits[pos] == 9) {
                digits[pos] = 0;
                pos --;
            } else {
                break;
            }
        }
        // all elements are '9'
        if (pos == -1) {
            int[] ret = new int[digits.length + 1];
            Arrays.fill(ret, 0);
            ret[0] = 1;
            return ret;
        }
        ++digits[pos];
        return digits;
    }
}
