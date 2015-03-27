package org.hfeng.oj.leet.implementstrstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        int[] n = getNext(needle);

        while (i < haystack.length() && j < needle.length()) {
            ////////////////////////////////////////////////////////
            // Here you will understand that j == -1 means first  //
            // characters from s and p are NOT match, move the s  //
            ////////////////////////////////////////////////////////
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = n[j];
            }
        }
        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    private int[] getNext(String pattern) {
        int[] next = new int[pattern.length()];
        next[0] = -1;
        int k = -1;
        int j = 0;

        while (j < pattern.length() - 1) {
            if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
                ++k;
                ++j;
                // The only one can be -1 is next[0]
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
