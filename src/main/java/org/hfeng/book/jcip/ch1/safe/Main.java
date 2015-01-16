package org.hfeng.book.jcip.ch1.safe;

import org.hfeng.book.jcip.ch1.Record;

public class Main {
    private final static int NUM = 20000;
    public static void main(String[] args) throws InterruptedException{
        SafeSequence safeSequence = new SafeSequence();
        Thread[] safeThread = new Thread[NUM];

        for (int i = 0; i < NUM; i++) {
            safeThread[i] = new Thread(new SafeThread(safeSequence));
            safeThread[i].start();
        }

        for (int i = 0; i < NUM; i++) {
            safeThread[i].join();
        }

        System.out.println("---------> Summary is " + Record.summary);
    }
}
