package org.hfeng.misc.hfdp.ch8.template.coffeeteawithhook;

public class MainTest {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("--------Tea---------------------");
        teaWithHook.prepareRecipe();
        System.out.println("--------Coffee------------------");
        coffeeWithHook.prepareRecipe();
    }
}

//////////////////////////////////////////////////////////
// <===================OUTPUT===================>       //
// --------Tea---------------------                     //
// Boiling water                                        //
// Steeping the tea                                     //
// Pouring into cup                                     //
// Would you like lemon with your coffee (y/n)          //
// n                                                    //
// --------Coffee------------------                     //
// Boiling water                                        //
// Dripping Coffee through filter                       //
// Pouring into cup                                     //
// Would you like milk and sugar with your coffee (y/n) //
// y                                                    //
// Adding Sugar and Milk                                //
//////////////////////////////////////////////////////////
