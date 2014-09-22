package org.hfeng.oj.leet.longestsubstringwithoutrepeat;

import java.util.Arrays;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[256];
        Arrays.fill(index, -1);
        int maxLen = 0;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i)]  >= 0) {
                maxLen = Math.max(len, maxLen);
                len = 0;
                i = index[s.charAt(i)] + 1;
                Arrays.fill(index, -1);
            }
            index[s.charAt(i)] = i;
            len++;
        }
        return Math.max(len, maxLen);
    }
}
