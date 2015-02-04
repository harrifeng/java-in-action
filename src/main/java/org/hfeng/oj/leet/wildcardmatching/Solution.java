package org.hfeng.oj.leet.wildcardmatching;

public class Solution {
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }
        // p is non zero from now
        if (p.charAt(0) == '*') {
            if (s.length() == 0) {
                return p.length() == 1;
            }
            //s  is non zero from now
            if (isMatch(s, p.substring(1))) {
                return true;
            }
            return isMatch(s.substring(1), p);
        } else {
            if (s.length() > 0 &&
                (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?')) {
                return isMatch(s.substring(1), p.substring(1));
            } else {
                return false;
            }
        }
    }
}
