package org.hfeng.misc.jdp.ch5.question9;

public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN");
        try {
            Something.method(3000);
        } catch (InterruptedException e) {

        }
        System.out.println("END");
    }
}
