package org.hfeng.oj.leet.quicksort;

public class Solution {

    public void quickSort(int[] num) {
        quickSortSub(num, 0, num.length - 1);
    }

    private void quickSortSub(int[] num, int left, int right) {
        if (left < right) {
            int index = partition(num, left, right);
            quickSortSub(num, left, index - 1);
            quickSortSub(num, index, right);
        }
    }

    private void swap(int[] num, int left, int right) {
        int tmp = num[left];
        num[left] = num[right];
        num[right] = tmp;
    }

    private int partition(int[] num, int left, int right) {
        int pivot = num[right];
        int i = left - 1;
        int j = left;
        for (; j < right; j++) {
            if (num[j] <= pivot) {
                i++;
                swap(num, i, j);
            }
        }
        swap(num, i + 1, right);
        return i + 1;
    }
}
