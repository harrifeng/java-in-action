package org.hfeng.misc.hfdp.ch7.facade;

public class MainTest {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Top Amplifier");
        DvdPlayer dvdPlayer = new DvdPlayer("Top DVD Player", amplifier);
        Screen screen = new Screen("Top Screen");

        HomeTheaterFacade homeTheaterFacade =
                new HomeTheaterFacade(amplifier, dvdPlayer, screen);

        homeTheaterFacade.oneKeyWatchMovie();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Amplifier is on                                //
// DVD player is on                               //
// Screen is on, enjoy the movie                  //
////////////////////////////////////////////////////
