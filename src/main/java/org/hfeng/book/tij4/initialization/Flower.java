package org.hfeng.book.tij4.initialization;

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Ctor w/ int arg only, petalCount=" + petalCount);
    }
    Flower(String ss) {
        System.out.println("Ctor w/ String arg only, s =" + ss);
        s = ss;
    }
    Flower(String s, int petals) {
        this(petals);
        //! this(s);  // Can't call two!
        this.s = s;   // Another use of "this"
        System.out.println("String & int args");
    }
    Flower() {
        this("hi", 47);
        System.out.println("default ctor(no args)");
    }
    void printPetalCount() {
        //! this(11); // Not inside non-ctor!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Ctor w/ int arg only, petalCount=47            //
// String & int args                              //
// default ctor(no args)                          //
// petalCount = 47 s = hi                         //
////////////////////////////////////////////////////
