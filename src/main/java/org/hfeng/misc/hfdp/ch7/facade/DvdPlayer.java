package org.hfeng.misc.hfdp.ch7.facade;

public class DvdPlayer {
    private String description;
    Amplifier amplifier;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("DVD player is on");
    }
}
