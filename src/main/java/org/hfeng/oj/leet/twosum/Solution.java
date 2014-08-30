package org.hfeng.oj.leet.twosum;

import java.util.Arrays;
import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (hashTable.containsKey(target - numbers[i])) {
                int[] ret = new int[2];
                ret[0] = Math.min(i + 1, hashTable.get(target - numbers[i]));
                ret[1] = Math.max(i + 1, hashTable.get(target - numbers[i]));
                return ret;
            }
            hashTable.put(numbers[i], i + 1);
        }
        return null;
    }
}
