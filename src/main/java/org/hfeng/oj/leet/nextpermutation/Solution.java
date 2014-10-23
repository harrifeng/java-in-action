package org.hfeng.oj.leet.nextpermutation;
public class Solution {
    public void nextPermutation(int[] num) {
        if (num.length <= 1) {
            return ;
        }
        int pivot = -1;

        for (int i = num.length - 1; i > 0; i--) {
            if (num[i-1]  < num[i]) {
                pivot = i - 1;
                break;
            }
        }
        // Largest order, reverse to get the result
        if (pivot == -1) {
            reverse(num, 0, num.length - 1);
            return;
        }
        int rightPivot = pivot + 1;
        for (int j = num.length - 1; j > pivot; j--) {
            if (num[j] > num[pivot]) {
                // rightPivot the smallest one that is bigger than pivot
                rightPivot = j;
                break;
            }
        }
        swap(num, pivot, rightPivot);
        reverse(num, pivot + 1, num.length - 1);
        return;
    }

    private void swap(int[] arr, int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
    private void reverse(int [] arr, int beg, int end) {
        while (beg < end) {
            swap(arr, beg, end);
            beg++;
            end--;
        }
    }
}
