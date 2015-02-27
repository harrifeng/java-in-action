package org.hfeng.oj.leet.addbinary;
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int adv = 0;
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            char cha = a.length() > i ? a.charAt(a.length() - i - 1) : '0';
            char chb = b.length() > i ? b.charAt(b.length() - i - 1) : '0';
            int sum = adv + (cha - '0') + (chb - '0');
            sb.insert(0, (sum % 2)) ;
            adv = sum / 2;
        }
        if (adv != 0) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
}
