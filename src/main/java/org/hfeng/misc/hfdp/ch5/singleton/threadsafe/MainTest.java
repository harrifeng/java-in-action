package org.hfeng.misc.hfdp.ch5.singleton.threadsafe;

public class MainTest {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new Thread(ChocolateBoiler.getInstance()).start();
        }
    }
}

/////////////////////////////////////////////////////////
// <===================OUTPUT===================>      //
// Creating unique instance of Chocolate Boiler        //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// Returning instance of Chocolate Boiler              //
// We boiled already! NO MORE Boil should ever happen! //
// We boiled already! NO MORE Boil should ever happen! //
// We boiled already! NO MORE Boil should ever happen! //
/////////////////////////////////////////////////////////
