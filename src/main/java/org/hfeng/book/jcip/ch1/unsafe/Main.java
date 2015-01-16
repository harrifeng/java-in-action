package org.hfeng.book.jcip.ch1.unsafe;

import org.hfeng.book.jcip.ch1.Record;


public class Main {
    private static final int NUM = 20000;
    public static void main(String[] args) throws InterruptedException{

        UnSafeSequence sequence = new UnSafeSequence();
        Thread[] thread = new Thread[NUM];

        for (int i = 0; i < NUM; i++) {
            thread[i] = new Thread(new UnSafeThread(sequence));
            thread[i].start();
        }

        for (int i = 0; i < NUM; i++) {
            thread[i].join();
        }
        System.out.println("---------> Summary is " + Record.summary);
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Now value is 19997                             //
// Now value is 19998                             //
// ---------> Summary is 199986813                //
////////////////////////////////////////////////////
