package org.hfeng.misc.hfdp.ch9.composite.menu;

public class MainTest {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast", "Breakfast");
        MenuComponent lunchMenu = new Menu("Lunch", "Lunch");
        MenuComponent dinnerMenu = new Menu("Dinner", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert", "Dessert menu is sub menu of Dinner");

        MenuComponent allMenus = new Menu("All", "All menus combined");

        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        breakfastMenu.add(new MenuItem(
                "Pancake",
                "scrambled eggs",
                true,
                2.99));
        breakfastMenu.add(new MenuItem(
                "Regular Pancake",
                "eggs, sausage",
                false,
                2.99));
        lunchMenu.add(new MenuItem(
                "HotDo",
                "hot dog, with cheese",
                false,
                3.05));
        dinnerMenu.add(new MenuItem(
                "Burrito",
                "A large burrito, with whole pinto beans",
                true,
                4.29));
        dessertMenu.add(new MenuItem(
                "Sorbet",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        dinnerMenu.add(dessertMenu);

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// All, All menus combined                        //
// -------------------------                      //
//                                                //
// Breakfast, Breakfast                           //
// -------------------------                      //
//  Pancake                                       //
// (v),2.99                                       //
// >>-- scrambled eggs                            //
//  Regular Pancake                               //
// 2.99                                           //
// >>-- eggs, sausage                             //
//                                                //
// Lunch, Lunch                                   //
// -------------------------                      //
//  HotDo                                         //
// 3.05                                           //
// >>-- hot dog, with cheese                      //
//                                                //
// Dinner, Dinner                                 //
// -------------------------                      //
//  Burrito                                       //
// (v),4.29                                       //
// >>-- A large burrito, with whole pinto beans   //
//                                                //
// Dessert, Dessert menu is sub menu of Dinner    //
// -------------------------                      //
//  Sorbet                                        //
// (v),1.89                                       //
// >>-- A scoop of raspberry and a scoop of lime  //
////////////////////////////////////////////////////
