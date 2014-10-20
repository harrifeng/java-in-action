package org.hfeng.oj.leet.removeduplicatefromsortedarraytwo;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }
        int index = 0;
        int sum = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[index]) {
                A[++index] = A[i];
                sum = 0;
            } else {
                if (sum == 0) {
                    A[++index] = A[i];
                    sum++;
                }
            }
        }
        return index+1;
    }
}
