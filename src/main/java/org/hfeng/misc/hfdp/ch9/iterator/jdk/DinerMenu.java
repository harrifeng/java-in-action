package org.hfeng.misc.hfdp.ch9.iterator.jdk;

import java.util.Iterator;

public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Hotdog", 3.05);
        addItem("Pasta", 3.89);
    }

    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems[numberOfItems++] = menuItem;
    }

    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
