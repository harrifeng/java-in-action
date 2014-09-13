package org.hfeng.oj.leet.searchrotatedsortedarraytwo;

public class Solution {
    public boolean search(int A[], int target) {
        int first = 0;
        int last = A.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (A[mid] == target) {
                return true;
            }

            if (A[first] < A[mid]) {
                if (A[first] <= target && target < A[mid]) {
                    last = mid;
                } else {
                    first = mid + 1;
                }
            } else if (A[first] > A[mid]) {
                if (A[mid] < target && target <= A[last]) {
                    first = mid + 1;
                } else {
                    last = mid;
                }
            } else {
                //skip duplicate one
                first++;
            }
        }
        return false;
    }
}
