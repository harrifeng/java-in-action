package org.hfeng.oj.leet.removeduplicatefromsortedarraytwo;
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 2) {
            return A.length;
        }
        int front = 0;
        int size = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[front] != A[i]) {
                // Every time front+ 1 is "Corrupted data", yuo have to give
                // A[X] value as soon as X over the gap into the corrupted area
                A[++front] = A[i];
                size = 0;
            } else {
                if (size == 0) {
                    // Every time front+ 1 is "Corrupted data", yuo have to give
                    // A[X] value as soon as X over the gap into the corrupted area
                    A[++front] = A[i];
                }
                size++;
            }
        }
        return front+1;
    }
}
