package org.hfeng.oj.leet.searchrotatedsortedarraytwo;
public class Solution {
    public boolean search(int A[], int target) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return true;
            }

            if (A[left] <= A[mid]) {
                if (A[left] <= target && target < A[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                if (A[mid] < target && target <= A[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        return false;
    }
}
