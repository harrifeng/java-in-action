package org.hfeng.jcip.ch1.unsafe;

public class UnSafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }

    public UnSafeSequence() {
        this.value = 0;
    }
}
