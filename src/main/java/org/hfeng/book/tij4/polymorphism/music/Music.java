package org.hfeng.book.tij4.polymorphism.music;

public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute); // Upcasting
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Wind.play() MIDDLE_C                           //
////////////////////////////////////////////////////
