package org.hfeng.oj.leet.mediantwosortedarrays;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int sum = A.length + B.length;
        if (sum % 2 == 1) {
            return findNth(A, B, sum / 2 + 1);
        } else {
            return (findNth(A, B, sum / 2) + findNth(A, B, sum / 2 + 1)) / 2.0 ;
        }
    }

    private int findNth(int A[], int B[], int n) {
        if (A.length == 0) {
            return B[n - 1];
        }
        if (B.length == 0) {
            return A[n - 1];
        }
        if (n == 1) {
            return Math.min(A[0], B[0]);
        }

        if (A.length > B.length) {
            return findNth(B, A, n);
        }

        int partA = Math.min(A.length, n / 2);
        int partB = n - partA;

        if (A[partA - 1] < B[partB - 1]) {
            return findNth(Arrays.copyOfRange(A, partA, A.length), B, n - partA);
        } else {
            return findNth(A, Arrays.copyOfRange(B, partB, B.length), n - partB);
        }
    }
}
