package org.hfeng.oj.leet.zigzagconversion;

public class Solution {
    public String convert(String s, int nRows) {
        // MISTAKE HERE
        if (nRows < 2) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[nRows];

        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }

        int group = nRows * 2 - 2;

        for (int i = 0; i < s.length(); i++) {
            int pos = i % group;
            if (pos < nRows) {
                // MISTAKE HERE
                sbs[pos].append(s.charAt(i));
            } else {
                sbs[group - pos].append(s.charAt(i));
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < sbs.length; i++) {
            ret.append(sbs[i]);
        }
        return ret.toString();
    }
}
