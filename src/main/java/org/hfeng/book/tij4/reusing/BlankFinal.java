package org.hfeng.book.tij4.reusing;

class Poppet {
    private int i;
    Poppet(int ii) { i = ii;}
}
public class BlankFinal {
    private final int i = 0; // Initialized final
    private final int j; // Blank final
    private final Poppet p; // Blank fianl ref

    // Blank finals MUST be initialized int the ctor:
    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public void getJ() {
        System.out.println(j);
    }

    public static void main(String[] args) {
        new BlankFinal().getJ();
        new BlankFinal(47).getJ();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 1                                              //
// 47                                             //
////////////////////////////////////////////////////
