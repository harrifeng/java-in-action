package org.hfeng.oj.leet.longestconsecutivesequence;
import java.util.*;

public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            int size = 1;
            if (map.containsKey(num[i] - 1)) {
                size += map.get(num[i] - 1);
            }
            if (map.containsKey(num[i] + 1)) {
                size += map.get(num[i] + 1);
            }
            map.put(num[i], size);
            max = Math.max(max, size);
        }
        return max;
    }
}
