package org.hfeng.oj.leet.threesumclosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
        if (num.length < 3) {
            return -1;
        }
        Arrays.sort(num);

        // MISTAKE HERE
        int closest = num[0] + num[1] + num[2];
        for (int i = 0; i < num.length; i++) {

            int beg = i + 1;
            int end = num.length - 1;

            while (beg < end) {
                int sum = num[beg] + num[end] + num[i];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    beg++;
                } else {
                    end--;
                }
            }
        }
        return closest;
    }
}
