package org.hfeng.oj.leet.nextpermutation;
public class Solution {
    public void nextPermutation(int[] num) {
        if (num.length <= 1) {
            return;
        }
        int i = 0;
        int j = 0;
        // num[a] < num[b], we want a here,
        // so we use i = num.length - 2 as start
        // if you use i = num.length - 1 as start,
        // remember to i-- before swap with j
        for (i = num.length - 2; i >= 0; i--) {
            if (num[i] < num[i+1]) {
                break;
            }
        }
        if (i == -1) {
            reverseArray(num, 0, num.length - 1);
            return;
        }

        for (j = num.length - 1; j > i; j--) {
            if (num[j] > num[i]) {
                break;
            }
        }
        swapArrayMember(num, i , j);
        reverseArray(num, i + 1, num.length - 1);
        return;
    }

    private void swapArrayMember(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }

    private void reverseArray(int[] array, int beg, int end) {
        while (beg < end) {
            swapArrayMember(array, beg, end);
            beg++;
            end--;
        }
    }
}
