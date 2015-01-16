package org.hfeng.book.tij4.operators;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);     // example 1
        System.out.println(x + " " + s);       // example 2
        System.out.println(y + z + " " + s);   // example 3
        s += "(summed) = ";
        System.out.println(s + (x + y + z));   // example 4
        System.out.println("" + x);            // example 5
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// x, y, z 012                                    //
// 0 x, y, z                                      //
// 3 x, y, z                                      //
// x, y, z (summed) = 3                           //
// 0                                              //
////////////////////////////////////////////////////
