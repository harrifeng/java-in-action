package org.hfeng.oj.leet.nextpermutation;

public class Solution {
    public void nextPermutation(int[] num) {
        if (num.length == 0 || num.length == 1) {
            return;
        }
        int i = 0;
        for (i = num.length - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                break;
            }
        }
        if (i == -1) {
            reverse(num, 0, num.length - 1);
            return;
        }

        int breaker = i + 1;
        for (int j = num.length - 1; j >= breaker; j--) {
            if (num[j] > num[breaker - 1]) {
                swap(num, j, breaker - 1);
                break;
            }
        }
        reverse(num, breaker, num.length - 1);
    }

    private void swap(int[] num, int left, int right) {
        int tmp = num[left];
        num[left] = num[right];
        num[right] = tmp;
    }

    private void reverse(int[] num, int beg, int end) {
        while (beg < end) {
            swap(num, beg, end);
            beg++;
            end--;
        }
    }
}
