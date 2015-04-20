package org.hfeng.misc.hfdp.ch7.facade;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Screen is on, enjoy the movie");
    }
}
