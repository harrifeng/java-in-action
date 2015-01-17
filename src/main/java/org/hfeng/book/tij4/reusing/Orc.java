package org.hfeng.book.tij4.reusing;

class Villain {
    private String name;
    protected  void set(String nm) {
        name = nm;
    }
    public Villain(String name) {
        this.name = name;
    }
    public String toString() {
        return "I'm a Villain and my name is " + name;
    }
}
public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber) {
        set(name); // Available because it's protected
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Orc 12: I'm a Villain and my name is Limburger //
// Orc 19: I'm a Villain and my name is Bob       //
////////////////////////////////////////////////////