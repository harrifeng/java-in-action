package org.hfeng.oj.leet.lengthoflastword;

public class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                ++len;
            } else if (s.charAt(i) == ' ') {
                while (i < s.length() - 1 && s.charAt(i + 1) == ' ') {
                    i++;
                }
                if (i == s.length() - 1) {
                    return len;
                }
                len = 0;
            }
        }
        return len;
    }
}
