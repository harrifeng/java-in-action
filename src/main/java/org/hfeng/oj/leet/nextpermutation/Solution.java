package org.hfeng.oj.leet.nextpermutation;

public class Solution {
    public void nextPermutation(int[] num) {
        int i = 0;
        for (i = num.length - 1; i > 0; i--) {
            if (num[i-1] < num[i]) {
                break;
            }
        }
        if (i == 0) {
            reverseArray(num, 0, num.length - 1);
            return;
        }
        int pivot = i - 1;
        for (i = num.length - 1; i > pivot; i--) {
            if (num[i] > num[pivot]) {
                break;
            }
        }
        swapArray(num, pivot, i);
        reverseArray(num, pivot + 1, num.length - 1);
        return;
    }
    private void swapArray(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    private void reverseArray(int[] arr, int beg, int end) {
        while (beg < end) {
            swapArray(arr, beg, end);
            beg++;
            end--;
        }
    }

}
