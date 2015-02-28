package org.hfeng.book.dpj.ch5.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("Already created the instance");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
