package org.hfeng.book.jcip.ch1.unsafe;

import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
public class UnSafeSequence {
    private int value;

    public int getNext() {
        return value++;
    }

    public UnSafeSequence() {
        this.value = 0;
    }
}
