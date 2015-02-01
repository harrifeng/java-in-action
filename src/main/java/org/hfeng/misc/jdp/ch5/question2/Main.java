package org.hfeng.misc.jdp.ch5.question2;

public class Main {
    public static void main(String[] args) {
        new MakerThread("ALice", new Table(3), 31415).start();
        new EaterThread("Bobby", new Table(3), 92653).start();
    }
}
