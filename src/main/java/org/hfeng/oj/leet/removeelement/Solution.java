package org.hfeng.oj.leet.removeelement;
public class Solution {
    public int removeElement(int[] A, int elem) {
        if (A.length == 0) {
            return 0;
        }
        int start = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                A[start++] = A[i];
            }
        }
        return start;
    }
}
