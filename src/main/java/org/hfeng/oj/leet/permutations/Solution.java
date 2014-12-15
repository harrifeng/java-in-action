package org.hfeng.oj.leet.permutations;

import org.hfeng.tij4.util.CountingGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        doPermute(num, 0, ret);
        return ret;
    }

    private void doPermute(int[] num, int level, List<List<Integer>> ret) {
        if (level == num.length) {
            List<Integer> ll = new ArrayList<Integer>();
            for (int i = 0; i < num.length; i++) {
                ll.add(num[i]);
            }
            ret.add(ll);
            return;
        }
        for (int i = level; i < num.length; i++) {
            swap(num, level, i);
            doPermute(num, level + 1, ret);
            swap(num, level, i);
        }
    }
    private void swap(int[] num, int a, int b) {
        int tmp = num[a];
        num[a] = num[b];
        num[b] = tmp;
    }
}