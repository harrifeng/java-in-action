package org.hfeng.oj.leet.permutations;
import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        doPermute(ret, 0, num);
        return ret;
    }

    private void doPermute(List<List<Integer>> result, int level, int[] num) {
        if (level == num.length) {
            List<Integer> one = new ArrayList<Integer>();
            for (int i = 0; i < num.length; i++) {
                one.add(num[i]);
            }
            result.add(one);
            return;
        }

        for (int i = level; i < num.length; i++) {
            swap(num, i, level);
            doPermute(result, level + 1, num);
            swap(num, i, level);
        }
    }

    private void swap(int[] num, int a, int b) {
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
        return;
    }
}
