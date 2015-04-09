package org.hfeng.oj.leet.countandsay;

public class Solution {
    public String countAndSay(int n) {
        StringBuilder s = new StringBuilder("1");

        for (int i = 1; i < n; i++) {
            StringBuilder tmp = new StringBuilder();
            int cnt = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(j - 1)) {
                    cnt++;
                } else {
                    tmp.append(cnt).append(s.charAt(j - 1));
                    cnt = 1;
                }
            }
            tmp.append(cnt).append(s.charAt(s.length() - 1));
            s = tmp;
        }
        return s.toString();
    }
}
