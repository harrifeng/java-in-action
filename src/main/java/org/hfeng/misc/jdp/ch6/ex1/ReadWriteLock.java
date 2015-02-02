package org.hfeng.misc.jdp.ch6.ex1;

public final class ReadWriteLock {
    private int readlingReaders = 0;
    private int waitingWriters = 0;
    private int writingWriters = 0;
    private boolean preferWriter = true;

    public synchronized void readLock() throws InterruptedException {
        while (writingWriters > 0 || (preferWriter && waitingWriters >0)) {
            wait();
        }
        readlingReaders++;
    }

    public synchronized void readUnlock() {
        readlingReaders--;
        preferWriter = true;
        notifyAll();
    }

    public synchronized void writeLock() throws InterruptedException {
        waitingWriters++;
        try {
            while (readlingReaders > 0 || writingWriters > 0) {
                wait();
            }
        } finally {
            waitingWriters--;
        }
        writingWriters++;
    }

    public synchronized void writeUnLock() {
        writingWriters--;
        preferWriter = false;
        notifyAll();
    }
}
