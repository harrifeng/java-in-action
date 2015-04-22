package org.hfeng.oj.leet.singlenumbertwo;

public class Solution {
    public int singleNumber(int[] A) {
        // Integer is 32 bit, if use 64 it will have undefined behavior
        // maybe using others' bits!
        final int SIZE = 32;
        int[] sum = new int[SIZE];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((A[i] & (1 << j)) > 0 ) {
                    ++sum[j];
                }
            }
        }

        int ret = 0;
        for (int i = 0; i < SIZE; i++) {
            ret += (sum[i] % 3) * (1 << i);
        }
        return ret;
    }
}
