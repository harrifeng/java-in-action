package org.hfeng.tij4.polymorphism.music;

// Wind objects are instruments
// because they have the same interface
public class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
