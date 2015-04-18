package org.hfeng.oj.leet.searchrotatedsortedarraytwo;

public class Solution {
    public boolean search(int A[], int target) {
        int beg = 0;
        int end = A.length - 1;
        while (beg <= end) {
            int mid = (beg + end) / 2;
            if (A[mid] == target) {
                return true;
            }
            if (A[beg] < A[mid]) {
                if (A[beg] <= target && target < A[mid]) {
                    end = mid;
                } else {
                    beg = mid + 1;
                }
            } else if (A[mid] < A[end]) {
                if (A[mid] < target && target <= A[end]) {
                    beg = mid + 1;
                } else {
                    end = mid;
                }
            } else {
                // worst case=> [1, 1, 1 , 2, 1], three are equal
                // remove the begin and end
                if (A[beg] == A[mid] && A[mid] == A[end]) {
                    beg++;
                    end--;
                } else if (A[beg] == A[mid]) {
                    beg = mid + 1;
                } else if (A[mid] == A[end]){
                    end = mid;
                }
            }
        }
        return false;
    }
}
