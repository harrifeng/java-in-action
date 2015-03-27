package org.hfeng.oj.leet.longestsubstringwithoutrepeat;

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[256];
        Arrays.fill(index, -1);

        int len = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (index[s.charAt(i)] != -1) {
                maxLen = Math.max(maxLen, len);
                i = index[s.charAt(i)] + 1;
                Arrays.fill(index, -1);
                len = 0;
            }
            index[s.charAt(i)] = i;
            len++;
        }
        return Math.max(maxLen, len);
    }
}
