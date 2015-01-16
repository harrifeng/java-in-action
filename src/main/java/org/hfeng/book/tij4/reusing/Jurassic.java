package org.hfeng.book.tij4.reusing;

class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f() {}
}

// error: Can not extend final class 'Dinosaur'
//! class Further extends Dinosaur {}
public class Jurassic {

    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
