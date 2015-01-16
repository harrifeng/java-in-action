package org.hfeng.book.tij4.operators;

public class Exponents {
    public static void main(String[] args) {

        // uppercase and lowercase 'e' are the same
        // stands for '10' NOT 2.718
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d;   // 'd' is optional
        double expDouble2 = 47e47d;  // Automatically double
        System.out.println(expDouble);
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 1.39E-43                                       //
// 4.7E48                                         //
////////////////////////////////////////////////////
