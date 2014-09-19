package org.hfeng.oj.leet.longestconsecutivesequence;

import java.util.*;

public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxLen = 1;

        for (int i = 0; i < num.length; i++) {
            // At least the length is 1
            map.put(num[i], 1);
            maxLen = Math.max(maxLen, findNearby(map, num[i]));
        }
        return maxLen;
    }

    private int findNearby(Map<Integer, Integer> map, int val) {
        if (!map.containsKey(val+1) && !map.containsKey(val-1)) {
            return 1;
        }
        int left = 0;
        int right = 0;
        if (map.containsKey(val-1)) {
            left = map.get(val-1);
        }
        if (map.containsKey(val+1)) {
            right = map.get(val+1);
        }
        int newLen = left + right + 1;
        map.put(val, newLen);
        return newLen;
    }
}
