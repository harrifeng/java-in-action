package org.hfeng.oj.leet.regularexpressionmatching;

public class Solution {
    public boolean isMatch(String s, String p) {
        // recursive method should find way to exit FIRSTLY!!
        if (p.length() == 0) {
            return s.length() == 0;
        }

        // p == 1 is a special case, should be consider alone
        if (p.length() == 1) {
            return (s.length() == 1)
                    && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0));
        }

        // In following cases, p.length() should always be greator than 1,
        // so no overflow should be considered.

        // Next p is not *
        if (p.charAt(1) != '*') {
            // Previous judgement can only make sure p is greater than 1,
            // so we must make sure p is greater or equal to 1 otherwise,
            // s.substring(1) can not work
            return (s.length() >= 1
                    && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')
                    && isMatch(s.substring(1), p.substring(1)));
        }

        // Next p does be *
        if (isMatch(s, p.substring(2))) {
            // try to match whole string FIRST!!
            // becasue `x*` can match ZERO character!!
            return true;
        } else {
            return (s.length() >= 1
                    && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')
                    && isMatch(s.substring(1), p));
        }
    }
}
