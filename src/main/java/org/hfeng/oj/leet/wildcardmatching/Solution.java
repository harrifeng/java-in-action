package org.hfeng.oj.leet.wildcardmatching;

public class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = 0;
        int pLen = 0;

        int lastL = Integer.MAX_VALUE;
        int lastS = sLen;

        while (sLen < s.length()) {
            // The easiest case : they are equal
            if (pLen < p.length() && (p.charAt(pLen) == '?' || s.charAt(sLen) == p.charAt(pLen))) {
                sLen++;
                pLen++;
                continue;
            }

            ///////////////////////////////////////////////////////////////////////
            // We meet a `*`, we may meet a lot of `*`, but only the last one is //
            // meaningful Actually, several `*` equals one. We have to remember  //
            // two things:                                                       //
            // 1. Last `*` position                                              //
            // 2. Last len position                                              //
            ///////////////////////////////////////////////////////////////////////

            if (pLen < p.length() && p.charAt(pLen) == '*') {
                lastL = pLen++;
                lastS = sLen;
                continue;
            }


            //////////////////////////////////////////////////////////////////////
            // lastL is not that 'big', which means we have encounter one `*`   //
            // before !                                                         //
            // Here we know why we need `*` position, and len position. because //
            // here we face mismatch, we need to 'rollback' to old position,    //
            // however s is plus one, which means `*` match one extra character //
            //////////////////////////////////////////////////////////////////////

            if (lastL < p.length()) {
                pLen = lastL + 1;
                sLen = ++lastS;
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
