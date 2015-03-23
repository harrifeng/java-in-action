package org.hfeng.misc.hfdp.ch4.factory.simple;

public class ClamPizza extends Pizza{
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clam");
        toppings.add("Crated parmesan cheese");
    }
}
