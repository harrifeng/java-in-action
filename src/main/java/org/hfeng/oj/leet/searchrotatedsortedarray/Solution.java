package org.hfeng.oj.leet.searchrotatedsortedarray;

public class Solution {
    public int search(int[] A, int target) {

        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return mid;
            }

            if (A[left] <= A[mid]) {
                // left is small than mid
                // target is between left and mid,
                // in this case, left part is MUST the solution.
                // in all other cases, right part is the solution.
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
        return -1;
    }
}
