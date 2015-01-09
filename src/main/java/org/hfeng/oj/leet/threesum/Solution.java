package org.hfeng.oj.leet.threesum;
import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (num.length < 3) {
            return ret;
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (i > 0 && num[i-1] == num[i]) {
                continue;
            }
            int beg = i + 1;
            int end = num.length - 1;
            while (beg < end) {
                int sum = num[i] + num[beg] + num[end];
                if (sum == 0) {
                    List<Integer> one = new ArrayList<Integer>();
                    one.add(num[i]);
                    one.add(num[beg]);
                    one.add(num[end]);
                    ret.add(one);
                    while (beg < end && num[beg] == num[beg+1] && num[end] == num[end-1]) {
                        beg++;
                        end--;
                    }
                    beg++;
                    end--;
                } else if (sum < 0) {
                    beg++;
                } else {
                    end--;
                }
            }
        }
        return ret;
    }
}
