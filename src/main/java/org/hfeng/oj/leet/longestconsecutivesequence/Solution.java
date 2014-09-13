package org.hfeng.oj.leet.longestconsecutivesequence;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestConsecutive(int[] num) {
        if (num.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int len = 1;

        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i])) {
                continue;
            }
            map.put(num[i], 1);
            if (map.containsKey(num[i] - 1)) {
                len = Math.max(len, mergeCluster(map, num[i] - 1, num[i]));
            }
            if (map.containsKey(num[i] + 1)) {
                len = Math.max(len, mergeCluster(map, num[i], num[i] + 1));
            }
        }
        return len;
    }

    private int mergeCluster(Map<Integer, Integer> map, int left, int right) {
        int upper = right + map.get(right) - 1;
        int lower = left - map.get(left) + 1;
        int length = upper - lower + 1;
        map.put(upper, length);
        map.put(lower, length);
        return length;
    }
}
