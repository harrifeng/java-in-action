package org.hfeng.misc.hfdp.ch9.iterator;

import java.util.ArrayList;

public class MCDMenu implements Menu{
    ArrayList menuItems;

    public MCDMenu() {
        menuItems = new ArrayList();
        addItem("MA", 1.0);
        addItem("MB", 2.0);
        addItem("MC", 3.0);
    }

    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new MCDMenuIterator(menuItems);
    }
}
