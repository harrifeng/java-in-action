package org.hfeng.misc.jdp.ch2.ex1;

public class Main {
    public static void main(String[] args) {
        Person alice = new Person("Alice", "Alaska");

        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
    }
}
