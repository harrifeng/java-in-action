package org.hfeng.book.tij4.holding;

import java.util.ArrayList;

class Grannysmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}

public class GenericsAndUpcasting {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new Grannysmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());

        for (Apple c : apples) {
            System.out.println(c);
        }
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// org.hfeng.book.tij4.holding.Grannysmith@b1e7b5      //
// org.hfeng.book.tij4.holding.Gala@1e352cc            //
// org.hfeng.book.tij4.holding.Fuji@150f2ec            //
// org.hfeng.book.tij4.holding.Braeburn@17c8ca2        //
////////////////////////////////////////////////////
