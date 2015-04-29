package org.hfeng.misc.hfdp.ch9.iterator.nojdk;

public class MainTest {
    public static void main(String[] args) {
        KFCMenu kfcMenu = new KFCMenu();
        MCDMenu mcdMenu = new MCDMenu();
        Waitress waitress = new Waitress(kfcMenu, mcdMenu);
        waitress.printMenu();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// KFC-------->                                   //
// KA, $1.0                                       //
// KB, $2.0                                       //
// KC, $3.0                                       //
// MCD-------->                                   //
// MA, $1.0                                       //
// MB, $2.0                                       //
// MC, $3.0                                       //
////////////////////////////////////////////////////
