package org.hfeng.tij4.reusing;

class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}
public class SprinklerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return
            "value 1 = " + value1 + " " +
            "value 2 = " + value2 + " " +
            "value 3 = " + value3 + " " +
            "value 4 = " + value4 + "\n" +
            "i = " + i + " " + "f = " + f + " " +
            "source = " + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinkler = new SprinklerSystem();
        System.out.println(sprinkler);
    }
}

/////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>              //
// WaterSource()                                               //
// value 1 = null value 2 = null value 3 = null value 4 = null //
// i = 0 f = 0.0 source = Constructed                          //
/////////////////////////////////////////////////////////////////
