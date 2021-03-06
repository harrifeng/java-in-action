package org.hfeng.misc.jdp.ch6.ex1;

public class ReaderThread extends Thread {
    private final Data data;
    public ReaderThread(Data data) {
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                char[] readbuf = data.read();
                System.out.println(Thread.currentThread().getName() + " read " + String.valueOf(readbuf));
            }
        } catch (InterruptedException e) {

        }
    }
}
