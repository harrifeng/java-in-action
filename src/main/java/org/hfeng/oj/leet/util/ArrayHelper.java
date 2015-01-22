package org.hfeng.oj.leet.util;

import java.util.Random;

public class ArrayHelper {
    public static int[] getRandomArray(int size) {
        if (size == 0) {
            return null;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        for (int i = array.length - 1; i > 0; i--) {
            int rand = randInt(0, i);
        }

        return null;
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();

        int randNum = rand.nextInt((max - min) + 1) + min;

        return randNum;
    }
}
