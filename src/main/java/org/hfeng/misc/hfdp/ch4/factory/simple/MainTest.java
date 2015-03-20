package org.hfeng.misc.hfdp.ch4.factory.simple;

public class MainTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a" + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a" + pizza.getName() + "\n");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Preparing Cheese Pizza                         //
// Baking Cheese Pizza                            //
// Cutting Cheese Pizza                           //
// Boxing Cheese Pizza                            //
// We ordered aCheese Pizza                       //
//                                                //
// Preparing Veggie Pizza                         //
// Baking Veggie Pizza                            //
// Cutting Veggie Pizza                           //
// Boxing Veggie Pizza                            //
// We ordered aVeggie Pizza                       //
////////////////////////////////////////////////////
