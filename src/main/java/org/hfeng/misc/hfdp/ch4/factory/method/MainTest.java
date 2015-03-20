package org.hfeng.misc.hfdp.ch4.factory.method;

public class MainTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Adam ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Bell ordered a " + pizza.getName() + "\n");
    }
}

///////////////////////////////////////////////////////////
// <===================OUTPUT===================>        //
// --- Making a NY Style Cheese Pizza ---                //
// Preparing NY Style Cheese Pizza                       //
//   Grated Reggiano Cheese                              //
// Bake for 25 minutes at 350                            //
// Cutting the pizza into diagonal slices                //
// Place pizza in official PizzaStore box                //
// Adam ordered a NY Style Cheese Pizza                  //
//                                                       //
// --- Making a Chicago Style Deep Dish Cheese Pizza --- //
// Preparing Chicago Style Deep Dish Cheese Pizza        //
//   Shredded Mozzarella Cheese                          //
// Bake for 25 minutes at 350                            //
// Cutting the pizza into square slices                  //
// Place pizza in official PizzaStore box                //
// Bell ordered a Chicago Style Deep Dish Cheese Pizza   //
///////////////////////////////////////////////////////////
