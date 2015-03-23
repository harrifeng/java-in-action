package org.hfeng.misc.hfdp.ch4.factory.abstractf;

public class MainTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Nina ordered a " + pizza);
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Clark ordered a " + pizza);

        pizza = nyStore.orderPizza("clam");
        System.out.println("Neil ordered a " + pizza);
        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Cindy ordered a" + pizza);
    }
}

/////////////////////////////////////////////////////////
// <===================OUTPUT===================>      //
// --- Making a New York Style Cheese Pizza ---        //
// Preparing New York Style Cheese Pizza               //
// Bake for 25 minutest at 350                         //
// Cuttng the pizza into diagonal slices               //
// Place pizza in official PizzaStore box              //
// Nina ordered a ---  New York Style Cheese Pizza --- //
// Thin Crust Dough                                    //
// Marinara Sauce                                      //
// Reggiano Cheese                                     //
//                                                     //
// --- Making a Chicago Style Cheese Pizza ---         //
// Preparing Chicago Style Cheese Pizza                //
// Bake for 25 minutest at 350                         //
// Cuttng the pizza into diagonal slices               //
// Place pizza in official PizzaStore box              //
// Clark ordered a ---  Chicago Style Cheese Pizza --- //
// Thin Crust Dough                                    //
// Marinara Sauce                                      //
// Shredded Mozzarella                                 //
//                                                     //
// --- Making a New York Style Clam Pizza ---          //
// Preparing New York Style Clam Pizza                 //
// Bake for 25 minutest at 350                         //
// Cuttng the pizza into diagonal slices               //
// Place pizza in official PizzaStore box              //
// Neil ordered a ---  New York Style Clam Pizza ---   //
// Thin Crust Dough                                    //
// Marinara Sauce                                      //
// Reggiano Cheese                                     //
// Fresh Clam from Long Island Sound                   //
//                                                     //
// --- Making a Chicago Style Clam Pizza ---           //
// Preparing Chicago Style Clam Pizza                  //
// Bake for 25 minutest at 350                         //
// Cuttng the pizza into diagonal slices               //
// Place pizza in official PizzaStore box              //
// Cindy ordered a---  Chicago Style Clam Pizza ---    //
// Thin Crust Dough                                    //
// Marinara Sauce                                      //
// Shredded Mozzarella                                 //
// Frozen Clam from Chesapeake Bay                     //
/////////////////////////////////////////////////////////
