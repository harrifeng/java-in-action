package org.hfeng.oj.leet.longestconsecutivesequence;
import java.util.*;
public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int maxSize = 0;

        for (int i = 0; i < num.length; i++) {
            int size = 1;
            if (hash.containsKey(num[i] - 1)) {
                size += hash.get(num[i] - 1);
            }
            if (hash.containsKey(num[i] + 1)) {
                size += hash.get(num[i] + 1);
            }
            hash.put(num[i], size);
            maxSize = Math.max(maxSize, size);
        }
        return maxSize;
    }
}
