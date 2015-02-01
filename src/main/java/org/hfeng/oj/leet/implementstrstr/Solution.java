package org.hfeng.oj.leet.implementstrstr;

import java.util.Arrays;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        if (needle == null) {
            return -1;
        }

        int[] next = getNext(needle);
        int q = -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (q > -1 && needle.charAt(q + 1) != haystack.charAt(i)) {
                q = next[q];
            }
            if (needle.charAt(q + 1) == haystack.charAt(i)) {
                q++;
            }

            if (q == needle.length() - 1) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    private int[] getNext(String pattern) {
        if (pattern == null || pattern.length() == 0) {
            return null;
        }
        int[] next = new int[pattern.length()];
        Arrays.fill(next, -1);

        int k = -1;
        for (int i = 1; i < pattern.length(); i++) {
            while (k > -1 && pattern.charAt(k + 1) != pattern.charAt(i)) {
                k = next[k];
            }
            if (pattern.charAt(k + 1) == pattern.charAt(i)) {
                k++;
            }
            next[i] = k;
        }
        return next;
    }
}