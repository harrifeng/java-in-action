package org.hfeng.oj.leet.removeduplicatefromsortedarraytwo;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }
        int start = 0;
        int count = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) {
                A[++start] = A[i];
                count = 1;
            } else {
                count++;
                if (count == 2) {
                    A[++start] = A[i];
                }
            }
        }
        return start + 1;
    }
}
