package org.hfeng.oj.leet.removeduplicatefromsortedarraytwo;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }
        int start = 2;
        for (int i = 2; i < A.length; i++) {
            if (A[start - 2] != A[i]) {
                A[start++] = A[i];
            }
        }
        return start;
    }
}
