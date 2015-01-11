package org.hfeng.jcip.ch1.safe;

import org.apache.http.annotation.GuardedBy;

public class SafeSequence {
    @GuardedBy("this") private int nextValue;

    public synchronized int getNext() {
        return nextValue++;
    }

    public SafeSequence() {
        nextValue = 0;
    }
}
