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
            /////////////////////////////////////////////////////////////////////////////////
            // value: 45601234                                                             //
            // index: 01234567                                                             //
            // if left = 0, mid = 3, then left part is positive sequence, right is not     //
            // if left = 0, mid = 4, then the right part is positive sequence, left is not //
            // That is to say: There are at least one part is positive sequence            //
            /////////////////////////////////////////////////////////////////////////////////
            if (A[left] <= A[mid]) {
                if (A[left] <= target && target < A[mid]) {
                    // left part is positive sequence, smaller binary search
                    right = mid;
                } else {
                    // right part is Not positive sequence, it is a smaller THIS question
                    left = mid + 1;
                }
            } else {

                if (A[mid] < target && target <= A[right]) {
                    // right part is positive sequence, smaller binary search
                    left = mid + 1;
                } else {
                    // left part is Not positive sequence, it is a smaller THIT question
                    right = mid;
                }
            }
        }
        return -1;
    }
}
