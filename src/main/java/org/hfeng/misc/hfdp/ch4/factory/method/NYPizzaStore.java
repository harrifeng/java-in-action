package org.hfeng.misc.hfdp.ch4.factory.method;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else {
            return null;
        }
    }
}
