package org.hfeng.book.ej2.item1;

public class Shape {
    public void display() {
        System.out.println(this + " is playing");
    }

    @Override
    public String toString() {
        return "Shape";
    }
}
