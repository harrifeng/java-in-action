package org.hfeng.tij4.reusing;

class Shape {
    Shape(int i) {
        System.out.println("Shape ctor");
    }
    void dispose() {
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends  Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing line: " + start + ", " + end);
    }
    void dispose() {
        System.out.println("Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}
public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];
    public CADSystem(int i) {
        super(i + 1);
        for(int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j*j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("Combined ctor");
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(47);
        try {
            // Code and exception handling...
        } finally {
            x.dispose();
        }
    }

    public void dispose() {
        System.out.println("CADSystem.dispose()");
        // The order of cleanup is the reverse
        // of the order of initialization
        t.dispose();
        c.dispose();
        for (int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Shape ctor                                     //
// Shape ctor                                     //
// Drawing line: 0, 0                             //
// Shape ctor                                     //
// Drawing line: 1, 1                             //
// Shape ctor                                     //
// Drawing line: 2, 4                             //
// Shape ctor                                     //
// Drawing Circle                                 //
// Shape ctor                                     //
// Drawing Triangle                               //
// Combined ctor                                  //
// CADSystem.dispose()                            //
// Erasing Triangle                               //
// Shape dispose                                  //
// Erasing Circle                                 //
// Shape dispose                                  //
// Erasing Line: 2, 4                             //
// Shape dispose                                  //
// Erasing Line: 1, 1                             //
// Shape dispose                                  //
// Erasing Line: 0, 0                             //
// Shape dispose                                  //
// Shape dispose                                  //
////////////////////////////////////////////////////
