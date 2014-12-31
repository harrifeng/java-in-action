package org.hfeng.oj.leet.zigzagconversion;

public class Solution {
    public String convert(String s, int nRows) {
        if (nRows == 1) {
            return s;
        }

        int group = nRows * 2 - 2;
        StringBuilder[] sb = new StringBuilder[nRows];
        for (int i = 0; i < nRows; i++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            int tmp = i % group;
            if (tmp < nRows) {
                sb[tmp].append(s.charAt(i));
            } else {
                sb[group - tmp].append(s.charAt(i));
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < nRows; i++) {
            ret.append(sb[i]);
        }
        return ret.toString();
    }
}
