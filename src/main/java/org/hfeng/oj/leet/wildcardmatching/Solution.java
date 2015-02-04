package org.hfeng.oj.leet.wildcardmatching;

import org.hfeng.book.tij4.util.CountingGenerator;

public class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = 0;
        int pLen = 0;

        int starLen = Integer.MAX_VALUE;
        int sTmpLen = sLen;

        while (sLen < s.length()) {
            if (pLen < p.length() && (p.charAt(pLen) == '?' || p.charAt(pLen) == s.charAt(sLen))) {
                sLen++;
                pLen++;
                continue;
            }
            if (pLen < p.length() && p.charAt(pLen) == '*') {
                starLen = pLen++;
                sTmpLen = sLen;
                continue;
            }
            if (starLen < p.length()) {
                pLen = starLen + 1;
                sLen = ++sTmpLen;
                continue;
            }
            return false;
        }

        while (pLen < p.length() && p.charAt(pLen) == '*') {
            pLen++;
        }

        return pLen == p.length();

    }
}
