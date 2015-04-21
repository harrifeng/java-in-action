package org.hfeng.oj.leet.threesumclosest;
import java.util.*;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        if (num.length < 3) {
            return -1;
        }

        int minSum = num[0] + num[1] + num[2];
        for (int i = 0; i < num.length; i++) {
            // if (i > 0 && num[i - 1] == num[i]) {
            //     continue;
            // }
            int beg = i + 1;
            int end = num.length - 1;
            while (beg < end) {
                int sum = num[i] + num[beg] + num[end];
                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < Math.abs(minSum - target)) {
                    minSum = sum;
                }
                if (sum < target) {
                    beg++;
                } else {
                    end--;
                }
            }
        }
        return minSum;
    }
}
