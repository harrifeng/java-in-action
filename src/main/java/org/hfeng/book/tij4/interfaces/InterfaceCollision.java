package org.hfeng.book.tij4.interfaces;

interface I1 {void f();}
interface I2 {int f(int i);}
interface I3 {int f();}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2 {
    public void f() {}
    public int f(int i){ // overloaded
        return 1;
    }
}

class C3 extends  C implements I2 {
    public int f(int i) { // overloaded
        return 1;
    }
}

class C4 extends C implements I3 {
    // Identical, no problem:
    public int f() {
        return 1;
    }
}

// Method differ only by return type:
// NOT work: attempting to use incompatible return type
//! class C5 extends C implements I1 {}
//! interface I4 extends I1, I3 {}

public class InterfaceCollision {
}
