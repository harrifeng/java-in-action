package org.hfeng.misc.concurrent.interrupt;


public class TestInterrupt {
    public static class ThreadCommon implements Runnable {
        public void run() {
            System.out.println("hello world");
        }
    }
}
