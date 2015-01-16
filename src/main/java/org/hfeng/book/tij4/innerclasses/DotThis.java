package org.hfeng.book.tij4.innerclasses;

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer() {
            // DotThis dot this would be the Outer "this"
            return DotThis.this;
            // A plain this would be Inner's "this"
        }
    }
    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// DotThis.f()                                    //
////////////////////////////////////////////////////
