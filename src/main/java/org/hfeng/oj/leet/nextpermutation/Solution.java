package org.hfeng.oj.leet.nextpermutation;

public class Solution {
    public void nextPermutation(int[] num) {
        if (num.length <= 1) {
            return;
        }

        int i, j;
        for (i = num.length - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                break;
            }
        }
        if (i == -1) {
            // biggest
            reverseArray(num, 0, num.length - 1);
            return;
        }
        for (j = num.length - 1; j > i; j--) {
            if (num[j] > num[i]) {
                break;
            }
        }
        swap(num, i, j);
        // MISTAKE HERE
        reverseArray(num, i + 1, num.length - 1);
        return;
    }

    private void swap(int[] arr, int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }

    private void reverseArray(int[] arr, int beg, int end) {
        while (beg < end) {
            swap(arr, beg, end);
            beg++;
            end--;
        }
    }
}
