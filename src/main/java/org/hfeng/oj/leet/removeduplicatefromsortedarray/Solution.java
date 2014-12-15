package org.hfeng.oj.leet.removeduplicatefromsortedarray;
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 1) {
            return A.length;
        }
        int start = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[start] != A[i]) {
                A[++start] = A[i];
            }
        }
        return start + 1;
    }
}
