package org.hfeng.oj.leet.foursum;

import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        Arrays.sort(num);
        // Assume num.length is bigger than or equal to 4
        for (int i = 0; i < num.length - 2; i++) {
            if (i > 0 && num[i] == num[i-1]) {
                continue;
            }
            for (int j = i + 1; i < num.length - 1; j++) {
                if (j > i + 1 && num[j] == num[j-1]) {
                    continue;
                }
                
                int beg = j + 1;
                int end = num.length - 1;
                while (beg < end) {
                    int sum = num[i] + num[j] + num[beg] + num[end];
                    if (sum == target) {
                        List<Integer> oneRet = new ArrayList<Integer>();
                        oneRet.add(num[i]);
                        oneRet.add(num[j]);
                        oneRet.add(num[beg]);
                        oneRet.add(num[end]);
                        ret.add(oneRet);
                        while(beg < end && num[beg] == num[beg+1] && num[end] == num[end-1]) {
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
