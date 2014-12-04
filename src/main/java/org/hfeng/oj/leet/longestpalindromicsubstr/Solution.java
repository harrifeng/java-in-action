package org.hfeng.oj.leet.longestpalindromicsubstr;
import java.util.*;

public class Solution {
    public String longestPalindrome(String s) {
        String ns = processStr(s);
        System.out.printf("%s%n", ns);

        int[] count = new int[ns.length()];
        System.out.printf("%s%n", Arrays.toString(count));

        int mostCenter = 0;
        int mostLocation = 0;
        for (int i = 1; i < ns.length() - 1; i++) {
            int mirror = 2 * mostCenter - i;
            int start = 0;
            if (mostLocation > i) {
                start = Math.min(count[mirror], mostLocation - i);
            }
            // Very easy to wrong
            while (ns.charAt(i+start) == ns.charAt(i-start)) {
                start++;
            }
            count[i] = start - 1;
        }
        System.out.printf("%s%n", Arrays.toString(count));
        int biggest = 0;
        for (int i = 1; i < count.length - 1; i++) {
            // Very easy to wrong
            if (count[i] > count[biggest]) {
                biggest = i;
            }
        }

        System.out.printf("%d %d\n", biggest, count[biggest]);

        StringBuilder sb = new StringBuilder();

        for(int i = biggest - count[biggest]; i <= biggest + count[biggest]; i++) {
            char now = ns.charAt(i);
            if (now != '^' && now != '#' && now != '$') {
                sb.append(now);
            }
        }
        return sb.toString();
    }

    private String processStr(String s) {
        StringBuffer sb = new StringBuffer("^#");
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append("#");
        }
        sb.append("$");
        return sb.toString();
    }
}
