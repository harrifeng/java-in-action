package org.hfeng.oj.leet.removeelement;

public class Solution {
    public int removeElement(int[] A, int elem) {
        int start = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[++start] = A[i];
            }
        }
        return start + 1;
    }
}
