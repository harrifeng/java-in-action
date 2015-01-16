package org.hfeng.book.tij4.initialization;

class Rock {
    Rock() { // ctor
        System.out.printf("Rock ");
    }
}
public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

///////////////////////////////////////////////////////
// <===================OUTPUT===================>    //
// Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock //
///////////////////////////////////////////////////////
