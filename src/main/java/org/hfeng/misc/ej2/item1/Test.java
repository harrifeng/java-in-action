package org.hfeng.misc.ej2.item1;

public class Test {
    public static void main(String[] args) {
        getShape(1).display();
    }

    // For ctors, they MUST return exactly the type they serve
    // However, for getShape static function method here, it
    // can return a subtype(Circle) of it Required type Shape
    public static Shape getShape(int index) {
        if (index > 0) {
            return new Circle();
        } else {
            return new Shape();
        }
    }


}
