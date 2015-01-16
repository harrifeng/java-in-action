package org.hfeng.book.tij4.operators;

public class TernaryIfElse {
    static int ternary(int i) {
        return i < 10 ? i * 100 : i * 10;
    }

    static int standardIfElese(int i) {
        if (i < 10) {
            return i * 100;
        } else {
            return i * 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElese(9));
        System.out.println(standardIfElese(10));
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 900                                            //
// 100                                            //
// 900                                            //
// 100                                            //
////////////////////////////////////////////////////
