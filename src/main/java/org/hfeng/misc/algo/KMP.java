package org.hfeng.misc.algo;

public class KMP {

    private int[] next;

    public int violentMatch(String str, String pattern) {
        int i = 0;
        int j = 0;
        while (i < str.length() && j < pattern.length()) {
            if (str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == pattern.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    public int kmpMatch(String str, String pattern) {
        next = getNext(pattern);
        int i = 0;
        int j = 0;
        while (i < str.length() && j < pattern.length()) {
            if (j == -1 || str.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j == pattern.length()) {
            return i - j;
        } else {
            return -1;
        }
    }

    private int[] getNext(String p) {
        int[] next = new int[p.length()];
        next[0] = -1;
        int k = -1;
        int j = 0;
        while (j < p.length() - 1) {
            if (k == -1 || p.charAt(j) == p.charAt(k)) {
                ++k;
                ++j;
                next[j] = k;
            } else {
                // If next[x] value is already created, it can
                // also be used when generating later next[x]!!
                k = next[k];
            }
        }
        return next;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP();
        String str = "bbc abcdab abcdabcdabde";
        String pattern = "abcdabd";

        System.out.println(kmp.violentMatch(str, pattern));
        System.out.println(kmp.kmpMatch(str, pattern));
    }
}
