package org.hfeng.misc.hfdp.ch9.iterator.jdk;

import java.util.Iterator;

public class Waitress {
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu dinerMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("Diner-------");
        printMenuWithIterator(dinerMenu.createIterator());
        System.out.println("Cafe--------");
        printMenuWithIterator(cafeMenu.createIterator());
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
