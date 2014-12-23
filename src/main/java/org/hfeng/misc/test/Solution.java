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
        int[][] matrix = new int[][]{ {1, 2}, {3, 4}, {5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
