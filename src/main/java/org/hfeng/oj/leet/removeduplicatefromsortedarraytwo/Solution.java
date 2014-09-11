package org.hfeng.oj.leet.removeduplicatefromsortedarraytwo;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        int index = 0;
        int count = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[index] != A[i]) {
                A[++index] = A[i];
                count = 1;
            } else {
                count++;
                if (count == 2) {
                    A[++index] = A[i];
                }
            }
        }
        return index + 1;
    }
}
