package org.hfeng.misc.jdp.ch1.question6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing EaterTherad, hit CTRL + C to exit. ");
        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");

        new EaterThread("ALice", spoon, fork).start();
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                // do nothing here
            }
        }
        new EaterThread("Bobby", fork, spoon).start();
    }
}
