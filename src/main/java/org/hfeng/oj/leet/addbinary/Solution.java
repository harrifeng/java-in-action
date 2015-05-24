package org.hfeng.oj.leet.addbinary;
public class Solution {
    public String addBinary(String a, String b) {
        int adv = 0;
        StringBuilder ret = new StringBuilder();

        for (int i= a.length() - 1, j= b.length() - 1; i >= 0 || j>= 0; ) {
            int sum = adv;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            adv = sum / 2;
            ret.insert(0, sum % 2);
        }
        if (adv == 1) {
            ret.insert(0, 1);
        }
        return ret.toString();
    }
}
