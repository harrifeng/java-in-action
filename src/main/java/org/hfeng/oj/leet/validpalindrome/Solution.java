package org.hfeng.oj.leet.validpalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        int beg = 0;
        int end = s.length() - 1;

        while (beg < end) {
            while (beg < s.length() && !Character.isLetterOrDigit(s.charAt(beg))) {
                beg++;
            }
            while (end > 0 && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (beg < end &&
                Character.toLowerCase(s.charAt(beg)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            beg++;
            end--;
        }
        return true;
    }
}
