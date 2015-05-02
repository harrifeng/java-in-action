package org.hfeng.misc.hfdp.ch9.iterator.jdk;

public class MainTest {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        LunchMenu lunchMenu = new LunchMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(breakfastMenu, lunchMenu, dinerMenu);
        waitress.printMenu();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Breakfast--------                              //
// Pancake, $2.99                                 //
// Waffles, $3.59                                 //
// Lunch------------                              //
// Veggie, $3.99                                  //
// Burrito, $4.29                                 //
// Diner------------                              //
// Hotdog, $3.05                                  //
// Pasta, $3.89                                   //
////////////////////////////////////////////////////
