package org.hfeng.oj.leet.wildcardmatching;

public class Solution {
    public boolean isMatch(String s, String p) {
        String star = new String();
        String ss = s;
        while (s.length() > 0) {
            if (p.length() > 0 && (p.charAt(0) == '?' || p.charAt(0) == s.charAt(0))) {
                s = s.substring(1);
                p = p.substring(1);
                continue;
            }
            if (p.length() > 0 && p.charAt(0) == '*') {
                star = p;
                p = p.substring(1);
                ss = s;
                continue;
            }
            if (star.length() > 0) {
                p = star.substring(1);
                ss = ss.substring(1);
                s = ss;
                continue;
            }
            return false;
        }
        while (p.length() > 0 && p.charAt(0) == '*') {
            p = p.substring(1);
        }
        return p.length() == 0;
    }
}
