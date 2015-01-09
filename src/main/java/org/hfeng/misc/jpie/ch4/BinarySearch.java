package org.hfeng.misc.jpie.ch4;

import java.util.Arrays;

public class BinarySearch {
    public static boolean binarySearch(int[] numbers, int value) {
        if (numbers.length < 1) {
            return false;
        }
        Arrays.sort(numbers);
        int beg = 0;
        int end = numbers.length - 1;
        while (beg <= end) {
            int mid = (beg + end) >>> 1;
            if (numbers[mid] == value) {
                return true;
            } else if (numbers[mid] < value) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = new int[] { 1, 3, 4, 5, 7, 9, 88};
        System.out.println(binarySearch(num, 7));
    }
}
