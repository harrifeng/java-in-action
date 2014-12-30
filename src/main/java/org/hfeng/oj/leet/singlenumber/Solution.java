package org.hfeng.oj.leet.singlenumer;

public class Solution {
    public int singleNumber(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int ret = A[0];
        for (int i = 1; i < A.length; i++) {
            ret ^= A[i];
        }
        return ret;
    }
}
