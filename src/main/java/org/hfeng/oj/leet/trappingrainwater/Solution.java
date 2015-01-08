package org.hfeng.oj.leet.trappingrainwater;
public class Solution {
    public int trap(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[max] < A[i]) {
                max = i;
            }
        }

        int ret = 0;
        for (int i = 0, top = 0; i < max; i++) {
            if (top < A[i]) {
                top = A[i];
            } else {
                ret += (top - A[i]);
            }
        }

        for (int i = A.length - 1, summit = 0; i > max; i--) {
            if (summit < A[i]) {
                summit = A[i];
            } else {
                ret += (summit - A[i]);
            }
        }
        return ret;
    }
}
