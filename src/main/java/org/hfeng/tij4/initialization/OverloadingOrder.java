package org.hfeng.tij4.initialization;

public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int:  " + i);
    }
    static void f(int i, String s) {
        System.out.println("int: " + i + ", String:" + s);
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int First");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// String: String first, int:  11                 //
// int: 99, String:Int First                      //
////////////////////////////////////////////////////
