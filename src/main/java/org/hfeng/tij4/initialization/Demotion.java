package org.hfeng.tij4.initialization;

public class Demotion {

    void f7(char x) {
        System.out.println("f7(char)");
    }

    void testDouble() {
        double x = 0;
        System.out.println("double argument");
        f7((char)x);
    }
    public static void main(String[] args) {
        Demotion p = new Demotion();
        p.testDouble();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// double argument                                //
// f7(char)                                       //
////////////////////////////////////////////////////
