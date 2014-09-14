package org.hfeng.tij4.control;

// For loops with "labeled break" and "labeled continue"
public class LabeledFor {
    public static void main(String[] args) {
        int i = 0;
        outer:
        //can't have statements here
        for (; true; ) { // infinite loop
            System.out.println("welcome back");
            inner:
            //can't have satements here
            for (; i < 10; i++) {
                System.out.println("i = " + i);

                if (i == 2) {
                    System.out.println("continue");
                    continue;
                }
                if (i == 3) {
                    System.out.println("break");
                    i++; // Otherwise i never gets incremented
                    break;
                }
                if (i == 7) {
                    System.out.println("continue outer");
                    i++; // Otherwise i newver gets incremented
                    continue outer;
                }
                if (i == 8) {
                    System.out.println("break outer");
                    break outer;
                }
                for (int k = 0; k < 5; k++) {
                    if (k == 3) {
                        System.out.println("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// welcome back                                   //
// i = 0                                          //
// continue inner                                 //
// i = 1                                          //
// continue inner                                 //
// i = 2                                          //
// continue                                       //
// i = 3                                          //
// break                                          //
// welcome back                                   //
// i = 4                                          //
// continue inner                                 //
// i = 5                                          //
// continue inner                                 //
// i = 6                                          //
// continue inner                                 //
// i = 7                                          //
// continue outer                                 //
// welcome back                                   //
// i = 8                                          //
// break outer                                    //
////////////////////////////////////////////////////
