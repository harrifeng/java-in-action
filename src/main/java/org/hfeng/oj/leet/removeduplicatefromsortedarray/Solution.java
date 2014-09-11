package org.hfeng.oj.leet.removeduplicatefromsortedarray;

public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        // anything Less Than Or Equal to index are unique
        int index = 0;
        // MISTAKE HERE
        for (int i = 1; i < A.length; i++) {
            if (A[index] != A[i]) {
                A[++index] = A[i];
            }
        }
        return index + 1;
    }
}
