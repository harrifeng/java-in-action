package org.hfeng.oj.leet.longestpalindromicsubstr;

public class Solution {
    public String longestPalindrome(String s) {

        String ns = polishStr(s);

        int[] value = new int[2010];

        int pivotIndex = 0;
        int pivotValue = 0;
        // ^ and $ won't count
        for (int i = 1; i < ns.length() - 1; i++) {
            int countpartIndex = Math.max(0, 2 * pivotIndex - i);
            int startValue = 0;
            if (value[countpartIndex] > pivotValue)  {
                startValue = pivotValue;
            } else {
                startValue = value[countpartIndex];
            }
            // MISTAKE HERE
            while (ns.charAt(i + startValue + 1) == ns.charAt(i - startValue - 1)) {
                startValue++;
            }
            value[i] = startValue;
        }

        int maxIndex = 0;
        for (int i = 1; i < ns.length(); i++) {
            // MISTAKE HERE
            if (value[i]  > value[maxIndex]) {
                maxIndex = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = maxIndex - value[maxIndex]; i < maxIndex + value[maxIndex]; i++) {
            char cs = ns.charAt(i);
            if (cs != '^' && cs != '$' && cs != '#') {
                sb.append(cs);
            }
        }
        return sb.toString();
    }

    private String polishStr(String s) {
        StringBuilder sb = new StringBuilder("^#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append("#");
        }
        sb.append("$");
        return sb.toString();
    }
}    
