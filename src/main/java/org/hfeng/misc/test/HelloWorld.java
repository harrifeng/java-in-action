package org.hfeng.misc.test;


import org.hfeng.oj.leet.util.ArrayHelper;

import java.util.concurrent.FutureTask;

public class HelloWorld {
    public static void main(String[] args) {

        int[] arr = new int[]{ 1, 2, 3};
        for (int a : arr) {
            System.out.println(a);
        }
        String s = "hello";

        for (char c : s.toCharArray()) {
            System.out.println(c);
        }
    }
}
