package org.hfeng.oj.leet.nextpermutation;

public class Solution {
    public void nextPermutation(int[] num) {
        if (num.length <= 1) {
            return;
        }

        int i, j;
        // From back to front, find the first
        // one to break ascending
        for (i = num.length - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                break;
            }
        }
        // if all ascending, it is the biggest
        // number. Reverse and return
        if (i == -1) {
            reverseArray(num, 0);
            return;
        }

        // From back to front, find the first one
        // that is bigger than i
        for (j = num.length - 1; j > i; j--) {
            if (num[j] > num[i]) {
                break;
            }
        }

        swapArrayElement(num, i, j);
        //reverse the one bigger than i
        reverseArray(num, i + 1);
    }

    private void reverseArray(int[] num, int beg) {
        int end = num.length - 1;
        while (beg < end) {
            swapArrayElement(num, beg, end);
            beg++;
            end--;
        }
    }

    private void swapArrayElement(int[] num, int a, int b) {
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
    }
}
