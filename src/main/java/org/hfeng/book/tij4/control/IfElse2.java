package org.hfeng.book.tij4.control;

public class IfElse2 {
    static int test(int testval, int target) {
        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0; //Match
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5));
        System.out.println(test(5, 10));
        System.out.println(test(5,5));
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 1                                              //
// -1                                             //
// 0                                              //
////////////////////////////////////////////////////
