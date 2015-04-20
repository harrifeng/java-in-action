package org.hfeng.misc.hfdp.ch7.facade;

public class Amplifier {
    String description;
    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Amplifier is on");
    }
}
