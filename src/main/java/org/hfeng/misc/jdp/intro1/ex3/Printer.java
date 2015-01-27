package org.hfeng.misc.jdp.intro1.ex3;

public class Printer implements Runnable {
    private String message;
    public Printer(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(message);
        }
    }
}