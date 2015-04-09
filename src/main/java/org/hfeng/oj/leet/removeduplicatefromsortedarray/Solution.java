package org.hfeng.oj.leet.removeduplicatefromsortedarray;
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length <= 1) {
            return A.length;
        }
        int front = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[front] != A[i]) {
                ++front;
                A[front] = A[i];
            }
        }
        return front + 1;
    }
}
