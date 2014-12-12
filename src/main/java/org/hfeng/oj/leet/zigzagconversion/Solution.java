package org.hfeng.oj.leet.zigzagconversion;
public class Solution {
    public String convert(String s, int nRows) {
        if (s.length() <= 1) {
            return s;
        }
        if (nRows <= 1) {
            return s;
        }
        int size = 2 * nRows - 2;
        StringBuilder[] sb = new StringBuilder[nRows];
        for (int i = 0; i < nRows; i ++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            int tmp = i % size;
            if (tmp < nRows) {
                sb[tmp].append(s.charAt(i));
            } else {
                sb[size - tmp].append(s.charAt(i));
            }
        }
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < nRows; i++) {
            ret.append(sb[i].toString());
        }
        return ret.toString();
    }
}
