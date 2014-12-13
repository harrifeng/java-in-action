package org.hfeng.tij4.holding;

import java.util.*;

public class AddingGroups {

    public static void main(String[] args) {
        Collection<Integer> collection =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreints = {6, 7, 8, 9, 10};
        Collections.addAll(Arrays.asList(moreints));
        // runs significantly faster, but you can't
        // construct a collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreints);
        // produces a list "backed by" an array:
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99); // ok -- modify an element
        System.out.println(list);
        // list.add(21); // runtime error because the underlying
        // array cannot be resized.
        // produces a list "backed by" an arraylist,
        // which is more flexible.
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(16, 17, 18, 19, 20));
        list2.add(21);
        list2.set(0, 99);
        System.out.println(list2);
    }

}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// [16, 99, 18, 19, 20]                           //
// [99, 17, 18, 19, 20, 21]                       //
////////////////////////////////////////////////////
