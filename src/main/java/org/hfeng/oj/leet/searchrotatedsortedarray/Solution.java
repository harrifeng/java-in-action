package org.hfeng.oj.leet.searchrotatedsortedarray;

public class Solution {
    public int search(int[] A, int target) {
        if (A.length == 0) {
            return -1;
        }
        int beg = 0;
        int end = A.length - 1;

        // equal to zero is important
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (A[mid] == target) {
                return mid;
            }

            // as multiple result is always ceiling
            // it is possible tha mid == beg
            if (A[beg] <= A[mid]) {
                // [beg, mid) is ordered
                if (A[beg] <= target && target < A[mid]) {
                    // mid can be equal to beg, should not -1
                    end = mid;
                } else {
                    beg = mid + 1;
                }
            } else {
                // (mid, end] is ordered
                if (A[mid] < target && target <= A[end]) {
                    beg = mid + 1;
                } else {
                    // mid can be equal to beg, should not -1
                    end = mid;
                }
            }
        }
        return -1;
    }
}
