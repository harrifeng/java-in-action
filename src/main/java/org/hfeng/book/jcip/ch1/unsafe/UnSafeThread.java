package org.hfeng.book.jcip.ch1.unsafe;

import org.hfeng.book.jcip.ch1.Record;

public class UnSafeThread implements Runnable {

    public UnSafeSequence getSequence() {
        return sequence;
    }

    private UnSafeSequence sequence;

    public void run() {
        int val = getSequence().getNext();
        Record.summary += val;
        System.out.println("Now value is " + val);
    }

    public UnSafeThread(UnSafeSequence sequence) {
        this.sequence = sequence;
    }
}
