package org.hfeng.misc.test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void printList(int[] num, int level, List<Integer> tmp, List<List<Integer>> list) {
        if (level == num.length) {
            System.out.println(tmp);
            return;
        }
        for (int i = level; i < num.length; i++){
            tmp.add(num[i]);
            printList(num, level + 1, tmp, list);
            tmp.remove(tmp.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Solution solution = new Solution();
        ArrayList<List<Integer>> ret = new ArrayList<List<Integer>>();
        solution.printList(array, 0, new ArrayList<Integer>(), ret);
    }
}
