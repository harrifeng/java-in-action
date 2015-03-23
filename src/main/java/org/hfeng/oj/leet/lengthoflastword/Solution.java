package org.hfeng.oj.leet.lengthoflastword;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        int len = s.length() - 1;
        while (len >= 0 && s.charAt(len) == ' ') {
            len--;
        }
        for (int i = len; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            sb.insert(0, s.charAt(i));
        }
        return sb.length();
    }
}
