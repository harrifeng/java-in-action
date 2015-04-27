package org.hfeng.misc.hfdp.ch9.iterator;

public class Waitress {
    private Menu kfcMenu;
    private Menu mcdMenu;

    public Waitress(Menu kfcMenu, Menu mcdMenu) {
        this.kfcMenu = kfcMenu;
        this.mcdMenu = mcdMenu;
    }

    public void printMenu() {
        System.out.println("KFC-------->");
        printMenuWithIterator(kfcMenu.createIterator());
        System.out.println("MCD-------->");
        printMenuWithIterator(mcdMenu.createIterator());
    }

    private void printMenuWithIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.toString());
        }
    }
}
