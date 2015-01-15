package org.hfeng.misc.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(1, 1);
        map.put(2,3);
        map.put(1, 23);
        System.out.println("hhh" + map.get(1));

        int[] nums = new int[] { 1, 2, 3, 4, 5};
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
