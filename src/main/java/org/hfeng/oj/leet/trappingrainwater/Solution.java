package org.hfeng.oj.leet.trappingrainwater;

public class Solution {
    public int trap(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        int left = 0;
        int right = A.length - 1;
        int ret = 0;
        while (left < right) {
            int min = Math.min(A[left], A[right]);
            if (A[left] == min) {
                left++;
                while (left < right && A[left] < min) {
                    ret += min - A[left];
                    left++;
                }
            } else {
                right--;
                while (left < right && A[right] < min) {
                    ret += min - A[right];
                    right--;
                }
            }
        }
        return ret;
    }
}
