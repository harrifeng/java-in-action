package org.hfeng.misc.jdp.ch5.question4;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);
        new MakerThread("MakerThread-1", table, 12345).start();
        new MakerThread("MakerThread-2", table, 22345).start();
        new MakerThread("MakerThread-3", table, 32345).start();
        new EaterThread("EaterThread-1", table, 45678).start();
        new EaterThread("EaterThread-2", table, 55678).start();
        new EaterThread("EaterThread-3", table, 65678).start();
    }
}
