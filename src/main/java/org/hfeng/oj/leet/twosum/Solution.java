package org.hfeng.oj.leet.twosum;
import java.util.*;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] ret = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                ret[0] = map.get(target - numbers[i]);
                ret[1] = i + 1;
                return ret;
            } else {
                map.put(numbers[i], i + 1);
            }
        }
        return ret;
    }
}
