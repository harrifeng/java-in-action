package org.hfeng.misc.hfdp.ch9.iterator.jdk;

import java.util.HashMap;
import java.util.Iterator;

public class LunchMenu implements Menu {
    HashMap<String, MenuItem> map = new HashMap<String, MenuItem>();

    public LunchMenu() {
        addItem("Veggie", 3.99);
        addItem("Burrito", 4.29);
    }

    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        map.put(menuItem.getName(), menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return map.values().iterator();
    }
}
