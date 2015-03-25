package org.hfeng.misc.hfdp.ch5.singleton.notthreadsafe;

public class MainTest {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            new Thread(new BoilerRunnable()).start();
        }
    }
}

////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                         //
// Creating unique instance of Chocolate Boiler, should happen only once! //
// Returning instance of Chocolate Boiler                                 //
// Filling                                                                //
// Returning instance of Chocolate Boiler                                 //
// Creating unique instance of Chocolate Boiler, should happen only once! //
// Returning instance of Chocolate Boiler                                 //
// Filling                                                                //
// Returning instance of Chocolate Boiler                                 //
// We boiled already! NO MORE Boil should ever happen!                    //
// Creating unique instance of Chocolate Boiler, should happen only once! //
// Returning instance of Chocolate Boiler                                 //
// Filling                                                                //
// Returning instance of Chocolate Boiler                                 //
// We boiled already! NO MORE Boil should ever happen!                    //
// We boiled already! NO MORE Boil should ever happen!                    //
////////////////////////////////////////////////////////////////////////////
