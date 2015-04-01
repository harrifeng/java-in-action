package org.hfeng.oj.leet.quicksort;

public class Solution {
    public void quickSort(int[] num) {
        doQuickSort(num, 0, num.length - 1);
    }

    private void doQuickSort(int[] num, int beg, int end) {
        if (beg < end) {
            int mid = partition(num, beg, end);
            doQuickSort(num, beg, mid - 1);
            doQuickSort(num, mid + 1, end);
        }
    }

    private int partition(int[] num, int beg, int end) {
        int pivot = num[end];
        int j = beg -1, i = beg;
        for (; i < end; i++) {
            if (num[i] < pivot) {
                j++;
                int tmp = num[i];
                num[i] = num[j];
                num[j] = tmp;
            }
        }
        int tmp = num[end];
        num[end] = num[j+1];
        num[j+1] = tmp;
        return j + 1;
    }
}
