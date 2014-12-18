package org.hfeng.oj.leet.searchrotatedsortedarray;
public class Solution {
    public int search(int[] A, int target) {
        int beg = 0;
        int end = A.length - 1;

        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (A[beg] <= A[mid]) {
                //Left side is ordered
                if (A[beg] <= target && target < A[mid]) {
                    // beg...mid-1 is strict ordered
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }
            } else {
                //right side id ordered
                if (A[mid] < target && target <= A[end]) {
                    beg = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
