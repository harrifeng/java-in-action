package org.hfeng.oj.leet.trappingrainwater;

public class Solution {
    public int trap(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int maxPos = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[maxPos]) {
                maxPos = i;
            }
        }
        int ret = 0;

        // first half
        int tall = A[0];
        // First can never store water
        for (int i = 1; i < maxPos; i++) {
            if (A[i] < tall) {
                ret += tall - A[i];
            } else {
                tall = A[i];
            }
        }

        tall = A[A.length - 1];
        // Last can never store water
        for (int i = A.length - 2; i > maxPos; i--) {
            if (A[i] < tall) {
                ret += tall - A[i];
            } else {
                tall = A[i];
            }
        }
        return ret;
    }
}
