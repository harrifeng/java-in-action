package org.hfeng.misc.hfdp.ch9.iterator;

public class KFCMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public KFCMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("KA", 1.0);
        addItem("KB", 2.0);
        addItem("KC", 3.0);
    }

    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems[numberOfItems++] = menuItem;
    }

    public Iterator createIterator() {
        return new KFCMenuIterator(menuItems);
    }
}
