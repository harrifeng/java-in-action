package org.hfeng.oj.leet.addbinary;

public class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder result = new StringBuilder();

        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int aj = (i >= 0 ? Character.digit(a.charAt(i), 10) : 0);
            int bj = (j >= 0 ? Character.digit(b.charAt(j), 10) : 0);
            int val = (aj + bj + carry) % 2;
            carry = (aj + bj + carry) / 2;
            result.insert(0, Integer.toString(val));
        }
        if (carry == 1) {
            result.insert(0, Integer.toString(1));
        }
        return result.toString();
    }
}
