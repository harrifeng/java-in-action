package org.hfeng.oj.leet.removeduplicatefromsortedarray;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int pivot = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[pivot] == A[i]) {
            } else {
                A[++pivot] = A[i];
            }
        }
        return pivot+1;
    }
}
