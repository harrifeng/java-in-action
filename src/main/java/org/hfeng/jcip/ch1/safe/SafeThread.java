package org.hfeng.jcip.ch1.safe;

import org.hfeng.jcip.ch1.Record;

public class SafeThread implements Runnable {

    public SafeSequence getSequence() {
        return sequence;
    }

    private SafeSequence sequence;

    public void run() {
        int val = getSequence().getNext();
        Record.summary += val;
        System.out.println("Now value is " + val);
    }

    public SafeThread(SafeSequence sequence) {
        this.sequence = sequence;
    }
}
