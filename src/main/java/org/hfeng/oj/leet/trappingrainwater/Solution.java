package org.hfeng.oj.leet.trappingrainwater;

public class Solution {
    public int trap(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        int max = 0; // highest one
        for (int i  = 0; i < A.length; i++) {
            if (A[i] > A[max]) {
                max = i;
            }
        }
        int water = 0;
        //peek is temp high value
        for (int i = 0, peak = 0; i < max; i++) {
            if (A[i] > peak) {
                peak = A[i];
            } else {
                // We know that there Must be some higher one
                // later, so we dare to add!
                water += peak - A[i];
            }
        }
        //top is temp high value
        for (int i = A.length - 1, top = 0; i > max ; i--) {
            if (A[i] > top) {
                top = A[i];
            } else {
                water += top - A[i];
            }
        }
        return water;
    }
}
