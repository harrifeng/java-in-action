package org.hfeng.tij4.reusing;

class Plate {

    Plate(int i) {
        System.out.println("Plate ctor");
    }
}

class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate ctor");
    }
}

class Utensil {

    Utensil(int i) {
        System.out.println("Utensil ctor");
    }
}

class Spoon extends Utensil {

    Spoon(int i) {
        super(i);
        System.out.println("Spoon ctor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork ctor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        System.out.println("Knife ctor");
    }
}

// A cultural way of doing something:
class Custom {
    Custom(int i) {
        System.out.println("Custom ctor");
    }
}
public class PlaceSetting extends Custom{
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceStting ctor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Custom ctor                                    //
// Utensil ctor                                   //
// Spoon ctor                                     //
// Utensil ctor                                   //
// Fork ctor                                      //
// Utensil ctor                                   //
// Knife ctor                                     //
// Plate ctor                                     //
// DinnerPlate ctor                               //
// PlaceStting ctor                               //
////////////////////////////////////////////////////
