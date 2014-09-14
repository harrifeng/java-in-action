package org.hfeng.oj.leet.threesum;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ret  = new ArrayList<List<Integer>>();

        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (i > 0 && num[i] == num[i - 1]) {
                // MISTAKE HERE
                continue;
            }
            int beg = i + 1;
            int end = num.length - 1;
            while (beg < end) {
                int sum = num[i] + num[beg] + num[end];
                if (sum == 0) {
                    List<Integer> li = new ArrayList<Integer>();
                    li.add(num[i]);
                    li.add(num[beg]);
                    li.add(num[end]);
                    ret.add(li);
                    // MISTAKE HERE
                    while (beg < end && num[beg + 1] == num[beg] && num[end - 1] == num[end]) {
                        beg++;
                        end--;
                    }
                    beg++;
                    end--;
                } else if (sum < 0) {
                    // No need to judge whether the num[beg+1] and num[beg]
                    // because if num[beg] is NOT EQUAL, num[beg+1] is NOT
                    // EQUAL either!!
                    beg++;
                } else {
                    // Same with sum < 0
                    end--;
                }
            }
        }
        return ret;
    }
}
