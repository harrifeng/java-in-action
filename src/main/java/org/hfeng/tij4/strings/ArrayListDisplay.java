package org.hfeng.tij4.strings;

import org.hfeng.tij4.generics.coffee.Coffee;
import org.hfeng.tij4.generics.coffee.CoffeeGenerator;

import java.util.ArrayList;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new CoffeeGenerator(10)) {
            coffees.add(c);
        }

        System.out.println(coffees);
    }
}
