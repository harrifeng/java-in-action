package org.hfeng.book.tij4.operators;

public class Precedence {
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        int a = x + y - 2 / 2 + z;
        int b = x + (y - 2) / (2 + z);
        System.out.println("a = " + a + " b = " + b);
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// a = 5 b = 1                                    //
////////////////////////////////////////////////////
