package org.hfeng.misc.hfdp.ch9.iterator.jdk;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenu implements Menu{
    private ArrayList<MenuItem> menuItems;

    public BreakfastMenu() {
        menuItems = new ArrayList<MenuItem>();

        menuItems.add(new MenuItem("Pancake", 2.99));
        menuItems.add(new MenuItem("Waffles", 3.59));
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
