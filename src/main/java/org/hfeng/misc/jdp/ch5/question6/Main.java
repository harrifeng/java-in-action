package org.hfeng.misc.jdp.ch5.question6;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);

        Thread[] threads = {
                new MakerThread("MakerThread-1", table, 12345),
                new MakerThread("MakerThread-2", table, 22345),
                new MakerThread("MakerThread-3", table, 32345),
                new EaterThread("EaterThread-1", table, 45678),
                new EaterThread("EaterThread-2", table, 55678),
                new EaterThread("EaterThread-3", table, 65678)
        };

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }

        System.out.println("****** Interrupt *******");

        //interrupt
        for (int i = 0; i < threads.length; i++) {
            threads[i].interrupt();
        }
    }
}
