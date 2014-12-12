package org.hfeng.tij4.holding;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics2 {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        // compile-time error:
        // apples.add(new orange());
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        // using foreach:
        for(Apple c : apples) {
            System.out.println(c.id());
        }
    }
}
////////////////////////////////////////////////////
// <===================output===================> //
// 0                                              //
// 1                                              //
// 2                                              //
// 0                                              //
// 1                                              //
// 2                                              //
////////////////////////////////////////////////////
