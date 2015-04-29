package org.hfeng.misc.hfdp.ch9.iterator.jdk;

import java.util.Iterator;

public class Waitress {
    private Menu breakfastMenu;
    private Menu lunchMenu;
    private Menu dinerMenu;



    public Waitress(Menu breakfastMenu, Menu lunchMenu, Menu dinerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("Breakfast--------");
        printMenuWithIterator(breakfastMenu.createIterator());
        System.out.println("Lunch------------");
        printMenuWithIterator(lunchMenu.createIterator());
        System.out.println("Diner------------");
        printMenuWithIterator(dinerMenu.createIterator());
    }

    private void printMenuWithIterator(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print("$" + menuItem.getPrice());
            System.out.println();
        }
    }
}
