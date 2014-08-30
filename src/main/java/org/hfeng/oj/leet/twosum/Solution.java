package org.hfeng.oj.leet.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                int[] ret = new int[2];
                ret[0] = Math.min(i + 1, map.get(target - numbers[i]));
                ret[1] = Math.max(i + 1, map.get(target - numbers[i]));
                return ret;
            }
            map.put(numbers[i], i + 1);
        }
        return null;
    }
}
