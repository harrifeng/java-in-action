package org.hfeng.misc.hfdp.ch9.iterator.jdk;

public class MainTest {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Diner-------                                   //
// Hotdog, $3.05                                  //
// Pasta, $3.89                                   //
// Cafe--------                                   //
// Veggie, $3.99                                  //
// Burrito, $4.29                                 //
////////////////////////////////////////////////////
