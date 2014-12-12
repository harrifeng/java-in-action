package org.hfeng.oj.leet.trappingrainwater;
public class Solution {
    public int trap(int[] A) {
        if (A.length < 2) {
            return 0;
        }

        int left = 0;
        int ret = 0;
        int sum = 0;
        int highest = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[highest]) {
                highest = i;
            }
        }
        for (int i = 1; i <= highest; i++) {
            if (A[left] <= A[i]) {
                ret += (i - left - 1) * A[left] - sum;
                sum = 0;
                left = i;
            } else {
                sum += A[i];
            }
        }
        int right = A.length - 1;
        sum = 0;
        for (int i = A.length - 2; i >= highest; i--) {
            if (A[right] <= A[i]) {
                ret += (right - i - 1) * A[right] - sum;
                sum = 0;
                right = i;
            } else {
                sum += A[i];
            }
        }
        return ret;
    }
}
