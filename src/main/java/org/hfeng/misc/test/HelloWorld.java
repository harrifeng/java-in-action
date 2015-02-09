package org.hfeng.misc.test;


import org.hfeng.oj.leet.util.ArrayHelper;

import java.util.concurrent.FutureTask;

public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(ArrayHelper.randInt(0,9));
        }

    }
}
