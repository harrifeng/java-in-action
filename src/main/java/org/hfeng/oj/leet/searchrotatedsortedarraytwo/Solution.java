package org.hfeng.oj.leet.searchrotatedsortedarraytwo;

public class Solution {
    public boolean search(int A[], int target) {
        int beg = 0;
        int end = A.length - 1;
        while (beg <= end) {
            int mid = (beg + end) >>> 1;
            if (A[mid] == target) {
                return true;
            }
            if (A[beg] < A[mid]) {
                // left is sorted
                if (A[beg] <= target && target < A[mid]) {
                    end = mid - 1;
                } else {
                    beg = mid + 1;
                }
            } else if (A[beg] > A[mid]){
                // right is sorted
                if (A[mid] < target && target <= A[end]) {
                    beg = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                // skip duplicate one
                beg++;
            }
        }
        return false;
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
// Difference with searchrotatedsortedarray:                                                         //
// + if duplicated elements are allowed, The logic 'A[beg] <= A[mid] will show [beg, mid] is sorted' //
//   is not correct anymore. For example [1, 3, 1, 1, 1, 1] => (beg = 0, mid = 3)                    //
// + so we split previous two coditions to three ones:                                               //
//   - A[beg] < A[mid]  ==> left sorted                                                              //
//   - A[beg] > A[mid]  ==> right sorted                                                             //
//   - A[beg] == A[mid] ==> skip current beg (beg++)                                                 //
///////////////////////////////////////////////////////////////////////////////////////////////////////
