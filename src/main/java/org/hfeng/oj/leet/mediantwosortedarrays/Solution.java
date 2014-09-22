package org.hfeng.oj.leet.mediantwosortedarrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int sum = A.length + B.length;
        if (sum % 2 == 1) {
            return findKth(A, B, sum / 2 + 1);
        } else {
            return (findKth(A, B, sum / 2) + findKth(A, B, sum / 2 + 1)) / 2.0;
        }
    }

    private int findKth(int A[], int B[], int k) {
        if (A.length > B.length) {
            return findKth(B, A, k);
        }
        if (A.length == 0) {
            return B[k-1];
        }
        if (B.length == 0) {
            return A[k-1];
        }
        if (k == 1) {
            return Math.min(A[0], B[0]);
        }

        int partA = Math.min(k/2, A.length);
        int partB = k - partA;

        if (A[partA - 1] < B[partB - 1]) {
            return findKth(Arrays.copyOfRange(A, partA, A.length), B, k - partA);
        } else {
            return findKth(A, Arrays.copyOfRange(B, partB, B.length), k - partB);
        }
    }
}
