package org.hfeng.misc.hfdp.ch9.iterator.jdk;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    public MenuItem next() {
        return list[position++];
    }

    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        if (position <= 0) {
            //throw new Exception("You can't remove an item until you've at least one next()");
        }
        if (list[position-1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i+1];
            }
            list[list.length] = null;
        }
    }
}
