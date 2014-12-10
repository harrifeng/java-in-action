package org.hfeng.oj.leet.searchrotatedsortedarray;

public class Solution {
    public int search(int[] A, int target) {
        int beg = 0;
        int end = A.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (target == A[mid]) {
                return target;
            }

            if (A[beg] < A[mid]) {
                if (A[beg] < target && target < A[mid]) {
                    end = mid - 1;
                } else {
                    beg = mid;
                }
            } else {
                if (A[mid] < target && target < A[end]) {
                    beg = mid + 1;
                } else {
                    end = mid;
                }
            }
        }
        return -1;
    }
}
