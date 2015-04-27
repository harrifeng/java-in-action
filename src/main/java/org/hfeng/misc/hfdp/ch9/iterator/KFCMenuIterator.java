package org.hfeng.misc.hfdp.ch9.iterator;

public class KFCMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public KFCMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[position++];
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
