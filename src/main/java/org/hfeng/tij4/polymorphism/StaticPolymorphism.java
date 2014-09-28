package org.hfeng.tij4.polymorphism;

class StaticSuper {
    public static String staticGet() {
        return "Base staticGet()";
    }
    public String dynamicGet() {
        return "base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet()";
    }
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}

public class StaticPolymorphism {

    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Base staticGet()                               //
// Derived dynamicGet()                           //
////////////////////////////////////////////////////
