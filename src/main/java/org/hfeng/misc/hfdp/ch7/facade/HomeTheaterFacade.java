package org.hfeng.misc.hfdp.ch7.facade;

public class HomeTheaterFacade {
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    Screen screen;

    public HomeTheaterFacade(Amplifier amplifier,
                             DvdPlayer dvdPlayer,
                             Screen screen) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.screen = screen;
    }

    public void oneKeyWatchMovie() {
        amplifier.on();
        dvdPlayer.on();
        screen.on();
    }

}
