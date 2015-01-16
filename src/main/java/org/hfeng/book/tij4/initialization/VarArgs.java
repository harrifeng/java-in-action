package org.hfeng.book.tij4.initialization;

class A {
}

public class VarArgs {
    static void printArray(Object[] args) {
        for (Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[] { new Integer(47),
                                  new Float(3.4),
                                  new Double(11.11)});
        printArray(new Object[] { "one", "two", "three"});
        printArray(new Object[] {new A(), new A(), new A()});
    }

}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 47 3.4 11.11                                   //
// one two three                                  //
// lang.tij4.initialization.A@162b333             //
// lang.tij4.initialization.A@e2f8c1              //
// lang.tij4.initialization.A@13954b1             //
////////////////////////////////////////////////////
