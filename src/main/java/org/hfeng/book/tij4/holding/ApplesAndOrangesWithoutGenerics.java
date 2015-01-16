package org.hfeng.book.tij4.holding;

import java.util.*;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // not prevented from adding an orange to apples:
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple) apples.get(i)).id();
        }
    }
}


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                                                                                        //
// Exception in thread "main" java.lang.ClassCastException: org.hfeng.book.tij4.holding.Orange cannot be cast to org.hfeng.book.tij4.holding.Apple //
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
