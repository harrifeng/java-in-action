package org.hfeng.oj.leet.foursum;
import java.util.*;
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        if (num.length < 4) {
            return null;
        }
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(num);

        for (int i = 0; i < num.length - 3; i++) {
            if (i > 0 && num[i] == num[i-1]) {
                continue;
            }
            for (int j = i + 1; j < num.length - 2; j++) {
                if (j > i + 1 && num[j] == num[j-1]) {
                    continue;
                }
                int beg = j + 1;
                int end = num.length - 1 ;
                while (beg < end) {
                    int sum = num[i] + num[j] + num[beg] + num[end];
                    if (sum == target) {
                        List<Integer> one = new ArrayList<Integer>();
                        one.add(num[i]);
                        one.add(num[j]);
                        one.add(num[beg]);
                        one.add(num[end]);
                        ret.add(one);
                        while (beg < end && num[beg] == num[beg+1] && num[end] == num[end-1]) {
                            beg++;
                            end--;
                        }
                        beg++;
                        end--;
                    } else if (sum < target) {
                        beg++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return ret;
    }
}
