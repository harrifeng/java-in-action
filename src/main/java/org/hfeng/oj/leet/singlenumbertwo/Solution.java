package org.hfeng.oj.leet.singlenumbertwo;

public class Solution {
    public int singleNumber(int[] A) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                count += ((A[j] >> i) & 1);
            }
            result |= ((count % 3) << i);
        }
        return result;
    }
}
