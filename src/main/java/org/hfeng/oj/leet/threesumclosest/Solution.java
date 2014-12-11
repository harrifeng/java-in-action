package org.hfeng.oj.leet.threesumclosest;
import java.util.*;

public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int min = num[0] + num[1] + num[2];
        for (int i = 0; i < num.length; i++) {
            int beg = i + 1;
            int end = num.length - 1;
            while (beg < end) {
                int sum = num[i] + num[beg] + num[end];
                if (sum == target) {
                    return sum;
                }
                if (Math.abs(sum - target) < Math.abs(min - target)) {
                    min = sum;
                }
                if (sum < target) {
                    beg++;
                } else {
                    end--;
                }
            }
        }
        return min;
    }
}
