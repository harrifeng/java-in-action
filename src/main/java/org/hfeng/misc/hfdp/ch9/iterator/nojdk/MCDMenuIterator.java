package org.hfeng.misc.hfdp.ch9.iterator.nojdk;

import java.util.*;
import java.util.Iterator;

public class MCDMenuIterator implements Iterator {
    private ArrayList items;
    private int position = 0;

    public MCDMenuIterator(ArrayList items) {
        this.items = items;
    }

    public Object next() {
        Object object = items.get(position++);
        return object;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
