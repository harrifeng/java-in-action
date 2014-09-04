package org.hfeng.oj.leet.zigzagconversion;

public class Solution {
    public String convert(String input, int n) {
        // MISTAKE HERE
        if (n < 2) {
            return input;
        }
        StringBuilder[] sbs = new StringBuilder[n];

        for (int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }

        int group = n * 2 - 2;

        for (int i = 0; i < input.length(); i++) {
            int pos = i % group;
            if (pos < n) {
                // MISTAKE HERE
                sbs[pos].append(input.charAt(i));
            } else {
                sbs[group - pos].append(input.charAt(i));
            }
        }

        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < sbs.length; i++) {
            ret.append(sbs[i]);
        }
        return ret.toString();
    }
}
