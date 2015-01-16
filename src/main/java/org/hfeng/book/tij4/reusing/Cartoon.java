package org.hfeng.book.tij4.reusing;

class Art {
    Art() {
        System.out.println("Art ctor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing ctor");
    }
}
public class Cartoon extends Drawing{
    public Cartoon() {
        System.out.println("Cartoon ctor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Art ctor                                       //
// Drawing ctor                                   //
// Cartoon ctor                                   //
////////////////////////////////////////////////////
