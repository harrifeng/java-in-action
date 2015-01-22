package org.hfeng.misc.jdp.intro1.ex2;

public class Main {
    public static void main(String[] args) {
        new PrintThread("Good!").start();
        new PrintThread("Nice!").start();
    }
}
