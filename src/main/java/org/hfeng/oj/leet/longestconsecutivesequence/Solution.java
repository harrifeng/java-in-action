package org.hfeng.oj.leet.longestconsecutivesequence;
import java.util.*;

public class Solution {
    public int longestConsecutive(int[] num) {
        int maxSize = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++) {
            int size = 1;
            if (map.containsKey(num[i]-1)) {
                size += map.get(num[i]-1);
            }
            if (map.containsKey(num[i]+1)) {
                size += map.get(num[i]+1);
            }
            maxSize = Math.max(maxSize, size);
            map.put(num[i], size);
        }
        return maxSize;
    }
}
