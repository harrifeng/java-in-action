package org.hfeng.oj.leet.removeelement;
public class Solution {
    public int removeElement(int[] A, int elem) {
        if (A.length == 0 || A == null) {
            return 0;
        }

        if (A.length == 1) {
            return (A[0] == elem ? 0 : 1);
        }

        int start = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != elem) {
                A[++start] = A[i];
            }
        }
        return start + 1;
    }
}
