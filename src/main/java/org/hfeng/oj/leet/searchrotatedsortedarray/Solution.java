package org.hfeng.oj.leet.searchrotatedsortedarray;

public class Solution {
    public int search(int[] A, int target) {
        if (A.length == 0) {
            return -1;
        }

        return ss(A, 0, A.length -1, target);
    }

    private int ss(int[] arr, int beg, int end, int target) {
        if (beg > end) {
            return -1;
        }

        if (target == arr[beg]) {
            return beg;
        }
        int mid = (beg + end) / 2;

        if (target > arr[beg]) {
            if (arr[mid] < arr[beg]) {
                return ss(arr, beg + 1, mid, target);
            } else {
                return ss(arr, beg + 1, end, target);
            }
        } else {
            if (arr[mid] > arr[beg]) {
                return ss(arr, mid, end, target);
            } else {
                return ss(arr, beg + 1, end, target);
            }
        }// target and arr[beg]

    }
}
